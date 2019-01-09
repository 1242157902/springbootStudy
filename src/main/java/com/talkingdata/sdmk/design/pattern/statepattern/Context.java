package com.talkingdata.sdmk.design.pattern.statepattern;

/**
 * User：    ysl
 * Date:   2018/1/22
 * Time:   9:54
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
