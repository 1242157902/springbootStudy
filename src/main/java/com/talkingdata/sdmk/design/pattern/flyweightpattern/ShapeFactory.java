package com.talkingdata.sdmk.design.pattern.flyweightpattern;

import java.util.HashMap;

/**
 * User：    ysl
 * Date:   2018/1/11
 * Time:   9:27
 */
public class ShapeFactory {

    private static final HashMap<String,Shape> circleMap = new HashMap<>();


    public static Shape getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);

        if(null == circle){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }

        return circle;
    }


}
