package com.talkingdata.sdmk.design.pattern.statepattern;

/**
 * User：    ysl
 * Date:   2018/1/22
 * Time:   9:59
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
