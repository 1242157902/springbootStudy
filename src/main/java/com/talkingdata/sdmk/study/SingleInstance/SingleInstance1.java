package com.talkingdata.sdmk.study.SingleInstance;

/**
 * User：    ysl
 * Date:   2017/7/22
 * Time:   17:36
 */
public class SingleInstance1 {


    //立即加载模式或者说恶汉模式，即在调用方法前实例已经被创建
    public static final SingleInstance1 singleInstance1 = new SingleInstance1();

    private SingleInstance1(){}

    public static SingleInstance1  getInstance(){
        return singleInstance1;
    }
}
