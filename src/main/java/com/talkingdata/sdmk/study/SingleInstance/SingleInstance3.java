package com.talkingdata.sdmk.study.SingleInstance;

/**
 * User：    ysl
 * Date:   2017/7/22
 * Time:   17:43
 */
public class SingleInstance3 {

    public static class SingleInstance3Handler{
        private static SingleInstance3 singleInstance3 =  new SingleInstance3();
    }
    //使用静态内置类实现DCL同样的效果
    private SingleInstance3(){}

    public static SingleInstance3 getInstance(){
        return SingleInstance3Handler.singleInstance3;
    }
}
