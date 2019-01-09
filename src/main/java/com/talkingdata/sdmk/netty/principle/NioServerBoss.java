package com.talkingdata.sdmk.netty.principle;

import com.talkingdata.sdmk.netty.principle.pool.Boss;
import com.talkingdata.sdmk.netty.principle.pool.NioSelectorRunnablePool;
import com.talkingdata.sdmk.netty.principle.pool.Worker;

import java.io.IOException;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.netty.principle
 * @Description: ${todo}
 * @date 2018/9/3 20:33
 * @email 1242157902@qq.com
 */
public class NioServerBoss extends AbstractNioSelector implements Boss {

    public NioServerBoss(Executor executor, String threadName, NioSelectorRunnablePool selectorRunnablePool) {
        super(executor, threadName, selectorRunnablePool);
    }

    @Override
    protected int select(Selector selector) throws IOException {
        return selector.select();
    }

    @Override
    protected void process(Selector selector) throws IOException {
        Set<SelectionKey> selectionKeys = selector.selectedKeys();
        if(selectionKeys.isEmpty()){
            return;
        }

        for (Iterator<SelectionKey> i = selectionKeys.iterator();i.hasNext();){
            SelectionKey key = i.next();
            i.remove();
            ServerSocketChannel serverSocketChannel = (ServerSocketChannel)key.channel();
            //新客户端
            SocketChannel channel = serverSocketChannel.accept();
            //设置为非阻塞
            channel.configureBlocking(false);
            //获取一个worker
            Worker nextWorker = getSelectorRunnablePool().nextWorker();
            nextWorker.registerNewChannelTask(channel);
            System.out.println("新客户端链接");
        }
    }


    @Override
    public void registerAcceptChannelTask(ServerSocketChannel serverChannel) {
        final Selector selector = this.selector;
        registerTask(new Runnable() {
            @Override
            public void run() {
                //注册serverChannel
                try {
                    serverChannel.register(selector, SelectionKey.OP_ACCEPT);
                } catch (ClosedChannelException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
