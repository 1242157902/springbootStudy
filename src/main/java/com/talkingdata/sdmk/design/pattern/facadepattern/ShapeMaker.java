package com.talkingdata.sdmk.design.pattern.facadepattern;

/**
 *
 * 外观类
 * User：    ysl
 * Date:   2018/1/9
 * Time:   9:42
 */
public class ShapeMaker {


    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){

        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
