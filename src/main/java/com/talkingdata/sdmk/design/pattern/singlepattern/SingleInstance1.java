package com.talkingdata.sdmk.design.pattern.singlepattern;

/**
 * User：    ysl
 * Date:   2017/12/20
 * Time:   18:30
 */
public class SingleInstance1 {

    private volatile static SingleInstance1 singleInstance1 ;

    private  SingleInstance1(){

    }

    /**
     * 双重校验锁（DCL）
     *      Lasy
     *      线程安全
     *      实现难度较为复杂
     * @return
     */

    public static SingleInstance1 getInstance(){
        if(null == singleInstance1){
            synchronized(SingleInstance1.class){
                singleInstance1 = new SingleInstance1();
            }
        }
        return singleInstance1;
    }
}
