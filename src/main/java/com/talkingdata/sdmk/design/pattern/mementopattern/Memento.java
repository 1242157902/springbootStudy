package com.talkingdata.sdmk.design.pattern.mementopattern;

/**
 * User：    ysl
 * Date:   2018/1/18
 * Time:   9:26
 */
public class Memento {

    private String state;

    public Memento() {
    }

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
