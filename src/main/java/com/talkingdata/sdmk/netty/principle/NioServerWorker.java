package com.talkingdata.sdmk.netty.principle;

import com.talkingdata.sdmk.netty.principle.pool.NioSelectorRunnablePool;
import com.talkingdata.sdmk.netty.principle.pool.Worker;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.netty.principle
 * @Description: ${todo}
 * @date 2018/9/3 23:00
 * @email 1242157902@qq.com
 */
public class NioServerWorker extends AbstractNioSelector implements Worker {
    public NioServerWorker(Executor executor, String threadName, NioSelectorRunnablePool selectorRunnablePool) {
        super(executor, threadName, selectorRunnablePool);
    }

    @Override
    protected int select(Selector selector) throws IOException {
        return selector.select(500);
    }

    @Override
    protected void process(Selector selector) throws IOException {

        Set<SelectionKey> selectionKeys = selector.selectedKeys();
        if(selectionKeys.isEmpty()){
            return;
        }
        Iterator<SelectionKey> ite = this.selector.selectedKeys().iterator();
        while (ite.hasNext()){
            SelectionKey key = ite.next();
            //移除，防止重复处理
            ite.remove();
            //得到事件发生的Socket通道
            SocketChannel channel = (SocketChannel)key.channel();
            //数据长度
            int ret = 0;
            boolean failure = true;
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            //读取数据
            try {
                ret = channel.read(buffer);
                failure = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
            //判断是否连接断开
            if(ret<=0 || failure){
                key.cancel();
                System.out.println("客户端连接断开");

            }else{
                System.out.println("收到数据:" + new String(buffer.array()));
                //回写数据
                ByteBuffer outBuffer = ByteBuffer.wrap("收到\r\n".getBytes());
                channel.write(outBuffer);
            }
        }

    }

    @Override
    public void registerNewChannelTask(SocketChannel channel) {

        final Selector selector = this.selector;
        registerTask(new Runnable() {
            @Override
            public void run() {
                //将客户端注册到selector中
                try {
                    channel.register(selector, SelectionKey.OP_READ);
                } catch (ClosedChannelException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
