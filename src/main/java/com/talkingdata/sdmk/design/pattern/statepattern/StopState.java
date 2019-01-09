package com.talkingdata.sdmk.design.pattern.statepattern;

/**
 * User：    ysl
 * Date:   2018/1/22
 * Time:   9:57
 */
public class StopState implements State {


    @Override
    public void doAction(Context context) {

        System.out.println("Player is in stop state.");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop  State.";
    }
}
