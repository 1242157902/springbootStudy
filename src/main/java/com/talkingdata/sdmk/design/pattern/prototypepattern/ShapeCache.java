package com.talkingdata.sdmk.design.pattern.prototypepattern;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * 创建一个类，从数据库中获取实体类，并把他们存储在一个HashTable中
 * User：    ysl
 * Date:   2017/12/21
 * Time:   14:32
 */
public class ShapeCache {

    private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape>();

    public static Shape getShape(String shapeId){
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape)cacheShape.clone();
    }

    /**
     * 每种形状都运行数据库查询，并创建该形状
     *
     *         实现操作，集成Cloneable接口，重写clone方法
     *
     * 例如：我们要添加三种形状
     *
     * 注意浅拷贝和深拷贝的区别
     */
    public static void loadCache(){

        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);


        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);

    }


    public static void clearCache(){
        Iterator<Map.Entry<String,Shape>> it = shapeMap.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,Shape> entry = it.next();
            entry = null;
        }
        shapeMap = null;

    }
}

