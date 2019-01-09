package com.talkingdata.sdmk.design.pattern.decoratorpattern;

/**
 * User：    ysl
 * Date:   2018/1/8
 * Time:   9:53
 */
public abstract class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
