package com.talkingdata.sdmk.netty.NIOServer;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.netty
 * @Description:  传统IO
 * @date 2018/8/29 19:20
 * @email 1242157902@qq.com
 */
public class OioServer {


    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newCachedThreadPool();
        //创建socket服务，监听10101端口
        ServerSocket serverSocket = new ServerSocket(10101);
        System.out.print("服务器启动");
        while (true){
            //获取一个套接字
            final Socket socket = serverSocket.accept();
            System.out.print("来一个客户端");
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    handler(socket);
                }
            });
        }
    }


    /**
     * 读取数据
     *
     * @param socket
     */
    private static void handler(Socket socket) {
        try {
            byte[] bytes = new byte[1024];
            InputStream inputStream = socket.getInputStream();
            while (true){
                //读取数据，阻塞
                int read = inputStream.read(bytes);
                if(read != -1){
                    System.out.print(new String(bytes,0,read) + "\n");
                }else{
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.print("socket关闭");
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
