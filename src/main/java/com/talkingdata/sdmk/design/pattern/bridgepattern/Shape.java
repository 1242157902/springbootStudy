package com.talkingdata.sdmk.design.pattern.bridgepattern;

/**
 * User：    ysl
 * Date:   2018/1/4
 * Time:   20:20
 */
public abstract  class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
