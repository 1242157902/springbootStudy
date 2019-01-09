package com.talkingdata.sdmk.design.pattern.prototypepattern;

/**
 * 创建扩展上面抽象类的实体类
 * User：    ysl
 * Date:   2017/12/21
 * Time:   14:27
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type  = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
