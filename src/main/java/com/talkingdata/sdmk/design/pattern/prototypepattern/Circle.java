package com.talkingdata.sdmk.design.pattern.prototypepattern;

/**
 * User：    ysl
 * Date:   2017/12/21
 * Time:   14:31
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
