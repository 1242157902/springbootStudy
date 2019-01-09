package com.talkingdata.sdmk.design.pattern.decoratorpattern;

/**
 * User：    ysl
 * Date:   2018/1/8
 * Time:   9:55
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color :Red");
    }
}
