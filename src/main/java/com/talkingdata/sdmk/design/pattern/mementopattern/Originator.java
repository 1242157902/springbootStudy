package com.talkingdata.sdmk.design.pattern.mementopattern;

/**
 * User：    ysl
 * Date:   2018/1/18
 * Time:   9:28
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
