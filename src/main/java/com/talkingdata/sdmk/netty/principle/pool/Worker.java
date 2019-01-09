package com.talkingdata.sdmk.netty.principle.pool;


import java.nio.channels.SocketChannel;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.netty.principle
 * @Description:  Worker接口
 * @date 2018/9/3 10:32
 * @email 1242157902@qq.com
 */
public interface Worker {


    public void registerNewChannelTask(SocketChannel channel);
}
