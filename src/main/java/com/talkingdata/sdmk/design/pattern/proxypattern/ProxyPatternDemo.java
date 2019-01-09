package com.talkingdata.sdmk.design.pattern.proxypattern;

/**
 * User：    ysl
 * Date:   2018/1/12
 * Time:   10:58
 */
public class ProxyPatternDemo {

    public static void main(String[] args){
        Image image = new ProxyImage("test_10b.jpg");

        image.dispaly();        //图像从磁盘
        System.out.println();
        //图像将无法从磁盘加载
        image.dispaly();
    }
}
