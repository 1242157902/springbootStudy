package com.talkingdata.sdmk.netty.principle;

import com.talkingdata.sdmk.netty.principle.pool.Boss;
import com.talkingdata.sdmk.netty.principle.pool.NioSelectorRunnablePool;

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.channels.ServerSocketChannel;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.netty.principle
 * @Description: ${todo}
 * @date 2018/9/5 13:24
 * @email 1242157902@qq.com
 */
public class ServerBootStrap {

    private NioSelectorRunnablePool selectorRunnablePool;
    public ServerBootStrap(NioSelectorRunnablePool selectorRunnablePool){
        this.selectorRunnablePool = selectorRunnablePool;
    }


    /**
     * 绑定端口
     *
     * @param localAddress
     */
    public void bind(final SocketAddress localAddress){
        //获得一个ServerSocket通道
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            //设置通道为非阻塞
            serverSocketChannel.configureBlocking(false);
            //将该通道对应的serverSocket绑定到port端口
            serverSocketChannel.socket().bind(localAddress);
            //获取一个boss线程
            Boss nextBoss = selectorRunnablePool.nextBoss();
            //向Boss注册一个serverSocket通道
            nextBoss.registerAcceptChannelTask(serverSocketChannel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
