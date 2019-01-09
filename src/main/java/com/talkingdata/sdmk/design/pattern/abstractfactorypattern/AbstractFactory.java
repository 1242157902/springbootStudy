package com.talkingdata.sdmk.design.pattern.abstractfactorypattern;

/**
 * User：    ysl
 * Date:   2017/12/18
 * Time:   18:04
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
