package com.talkingdata.sdmk.study.SingleInstance;

/**
 * User：    ysl
 * Date:   2017/7/22
 * Time:   18:08
 */
public class SingleInstance4 {
    private SingleInstance4(){}

    public static SingleInstance4 singleInstance4;

    static {
        singleInstance4 = new SingleInstance4();
    }

    public static SingleInstance4 getInstance(){
        return singleInstance4;
    }
}
