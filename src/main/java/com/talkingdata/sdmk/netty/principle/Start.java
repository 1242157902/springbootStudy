package com.talkingdata.sdmk.netty.principle;

import com.talkingdata.sdmk.netty.principle.pool.NioSelectorRunnablePool;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.netty.principle
 * @Description: ${todo}
 * @date 2018/9/5 14:06
 * @email 1242157902@qq.com
 */
public class Start {


    public static void main(String[] args) {

        //初始化线程
        NioSelectorRunnablePool nioSelectorRunnablePool = new NioSelectorRunnablePool(
                Executors.newCachedThreadPool(),Executors.newCachedThreadPool());

        //获取服务类
        ServerBootStrap bootStrap = new ServerBootStrap(nioSelectorRunnablePool);

        //绑定端口
        bootStrap.bind(new InetSocketAddress(10101));
        System.out.println("start");

    }

}
