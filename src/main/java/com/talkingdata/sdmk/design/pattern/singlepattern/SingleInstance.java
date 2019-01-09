package com.talkingdata.sdmk.design.pattern.singlepattern;

/**
 * User：    ysl
 * Date:   2017/12/20
 * Time:   18:21
 */
public class SingleInstance {

    //创建一个SingleInstance对象
    private static SingleInstance singleInstance = new SingleInstance();

    //让构造函数私有化，这样该类就无法被实例化
    private SingleInstance(){

    }

    //提供唯一对象的方法
    public static SingleInstance getSingleInstance(){
        return singleInstance;
    }
}
