package com.talkingdata.sdmk.netty.principle.pool;


import java.nio.channels.ServerSocketChannel;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.netty.principle
 * @Description: boss接口
 * @date 2018/9/3 10:30
 * @email 1242157902@qq.com
 */
public interface Boss {


    /**
     * 加入新的serverSocket
     * @param serverSocketChannel
     */
    public void registerAcceptChannelTask(ServerSocketChannel serverSocketChannel);

}
