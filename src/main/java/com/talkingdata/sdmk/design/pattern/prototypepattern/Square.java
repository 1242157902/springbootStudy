package com.talkingdata.sdmk.design.pattern.prototypepattern;

/**
 * User：    ysl
 * Date:   2017/12/21
 * Time:   14:30
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
