package com.talkingdata.sdmk.netty.NIOServer;



import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.netty.NIOServer
 * @Description: NIOServer端
 * @date 2018/8/30 15:50
 * @email 1242157902@qq.com
 */
public class NioServer {

    //通道管理器
    private Selector selector;


    /**
     * 获得一个ServerSocket通道，并对该通道一些初始化的工作
     * @param port
     *              :绑定端口号
     * @throws IOException
     */
    public void initServer(int port)throws IOException{
        //获得一个serverSocket通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //设置通道为非阻塞
        serverSocketChannel.configureBlocking(false);
        //将该通道对应的ServerSocket绑定到port端口
        serverSocketChannel.socket().bind(new InetSocketAddress(port));
        //获得一个通道管理器
        this.selector = Selector.open();
        //将通道管理器与该通道绑定，并为该通道注册SelectionKey.OP_ACCESSPT事件，注册该事件后，
        //当该事件到达时，selector.select（）会返回，如果该事件没到达，selector.select（）会一直阻塞
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
    }


    /**
     * 采用轮询的方式监听selector上是否需要处理的事件，如果有，则进行处理
     *
     * @throws IOException
     */
    public void listen()throws IOException{
        System.out.println("服务端启动");
        //轮询访问selector
        while (true){
            //当注册事件到达时，方法返回，否则，该方法会一直阻塞
            selector.select();
            //获得selector中选中项的迭代器，选中的项为注册事件
            Iterator<SelectionKey> iterator = this.selector.selectedKeys().iterator();
            while (iterator.hasNext()){
                SelectionKey selectionKey = iterator.next();
                //删除已选的key，以防重复处理
                iterator.remove();
                handler(selectionKey);
            }
        }
    }


    /**
     * 处理请求
     *
     * @param selectionKey
     */
    private void handler(SelectionKey selectionKey) throws IOException {
        //处理客户端的请求连接事件
        if(selectionKey.isAcceptable()){
            handlerAccept(selectionKey);
        }else if(selectionKey.isReadable()){
            handlerRead(selectionKey);
        }
    }


    /**
     * 处理连接请求
     *
     * @param selectionKey
     */
    private void handlerRead(SelectionKey selectionKey) throws IOException {
        //服务器可读取信息，得到事件发生的Socket通道
        SocketChannel channel = (SocketChannel)selectionKey.channel();
        //创建读取的缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int read = channel.read(buffer);
        if(read>0){
            byte[] data = buffer.array();
            String msg = new String(data).trim();
            System.out.println("服务端收到信息：" + msg);
            ByteBuffer outBuffer = ByteBuffer.wrap("好的".getBytes());
            channel.write(outBuffer);
        }else{
            System.out.println("客户端关闭");
            selectionKey.cancel();
        }
    }


    /**
     * 处理读的事件
     *
     * @param selectionKey
     * @throws IOException
     */
    private void handlerAccept(SelectionKey selectionKey) throws IOException {
        ServerSocketChannel server = (ServerSocketChannel)selectionKey.channel();
        //获得与客户端的通道
        SocketChannel channel = server.accept();
        //设置成非阻塞的
        channel.configureBlocking(false);
        System.out.println("新的客户端连接");
        //在与客户端连接成功后，为了可以接收到客户端的信息，需要给通道设置成读的权限
        channel.register(this.selector,SelectionKey.OP_READ);
    }

    public static void main(String[] args) throws IOException {
        NioServer server = new NioServer();
        server.initServer(8000);
        server.listen();
    }
}
