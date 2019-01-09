package com.talkingdata.sdmk.design.pattern.observerpattern;

/**
 * User：    ysl
 * Date:   2018/1/19
 * Time:   11:59
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
