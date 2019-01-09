package com.talkingdata.sdmk.design.pattern.singlepattern;

/**
 * 这种方式：
 *      自动支持序列化机制，绝对防止多次实例化
 *          也是Effective Java 的作者Josh Bloch提倡的方式
 *
 * User：    ysl
 * Date:   2017/12/20
 * Time:   18:45
 */
public enum SingleInstance4 {
    INSTANCE_4;

    public void getInstance(){
    }

}
