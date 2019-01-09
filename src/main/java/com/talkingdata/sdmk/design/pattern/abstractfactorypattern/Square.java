package com.talkingdata.sdmk.design.pattern.abstractfactorypattern;

/**
 * User：    ysl
 * Date:   2017/12/18
 * Time:   17:21
 */
public class Square implements Shape {


    @Override
    public void draw(){
        System.out.println("Inside Square::draw() method.");
    }
}
