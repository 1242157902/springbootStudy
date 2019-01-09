package com.talkingdata.sdmk.design.pattern.factorypattern;

/**
 * User：    ysl
 * Date:   2017/12/18
 * Time:   17:19
 */
public class Rectangle implements Shape {

    @Override
   public void draw(){
        System.out.println("Inside Rectangle::draw() method.");
    }
}
