package com.talkingdata.sdmk.design.pattern.abstractfactorypattern;


import org.apache.xmlbeans.impl.xb.xsdschema.Public;

/**
 * User：    ysl
 * Date:   2017/12/18
 * Time:   17:22
 */
public class ShapeFactory  extends AbstractFactory{

    @Override
    public Color getColor(String color){

        return null;
    }

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        Shape shape = null;
        if(null == shapeType){
            return  null;
        }else {
            shapeType = shapeType.toUpperCase();
        }
        switch ( shapeType){
            case "CIRCLE":
                shape = new Circle();
                break;
            case "RECTANGLE":
                shape = new Rectangle();
                break;
            case "SQUARE":
                shape = new Square();
                break;
            default:
                break;

        }
        return shape;
    }
}
