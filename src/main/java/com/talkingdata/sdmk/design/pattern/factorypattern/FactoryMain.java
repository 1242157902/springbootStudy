package com.talkingdata.sdmk.design.pattern.factorypattern;

/**
 * User：    ysl
 * Date:   2017/12/18
 * Time:   17:30
 */
public class FactoryMain {

    public static void main(String[] args)throws Exception{

        ShapeFactory shapeFactory = new ShapeFactory();


        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIrCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();

        Rectangle rect = (Rectangle) ShapeFactory1.getClass(Rectangle.class);
        rect.draw();
        Square square = (Square) ShapeFactory1.getClass(Square.class);
        square.draw();

    }
}
