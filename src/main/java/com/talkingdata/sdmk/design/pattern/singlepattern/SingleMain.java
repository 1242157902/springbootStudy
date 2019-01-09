package com.talkingdata.sdmk.design.pattern.singlepattern;

/**
 * User：    ysl
 * Date:   2017/12/20
 * Time:   18:47
 */
public class SingleMain {

    public static void main(String[] args){
        SingleInstance4 singleInstance4 =  SingleInstance4.INSTANCE_4;
        SingleInstance4 singleInstance5 =  SingleInstance4.INSTANCE_4;

        System.out.println(singleInstance4 == singleInstance5);
    }
}
