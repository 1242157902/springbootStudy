package com.talkingdata.sdmk.design.pattern.factorypattern;


/**
 * User：    ysl
 * Date:   2017/12/18
 * Time:   17:22
 */
public class ShapeFactory {


    /**
     *缺点：每增加一个产品时，都需要增加一个具体类和对象实现工厂，使得
     * 系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了
     * 系统具体类的依赖
     *
     * @param shapeType
     * @return
     */

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
