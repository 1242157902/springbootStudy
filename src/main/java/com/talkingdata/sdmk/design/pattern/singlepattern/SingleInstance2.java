package com.talkingdata.sdmk.design.pattern.singlepattern;

/**
 *
 * 这种方式：
 *  Lazy初始化
 *  线程安全
 *  实现难度一般
 *  能够达到与DCL一样的效果，都是利用classloder机制来保证初始化的
 *
 *
 * User：    ysl
 * Date:   2017/12/20
 * Time:   18:38
 */
public class SingleInstance2 {

    public static class SingleHolder{
        private static final SingleInstance2 INSTANCE= new SingleInstance2();
    }

    private SingleInstance2(){

    }

    public static final SingleInstance2 getInstance(){
        return SingleHolder.INSTANCE;
    }
}
