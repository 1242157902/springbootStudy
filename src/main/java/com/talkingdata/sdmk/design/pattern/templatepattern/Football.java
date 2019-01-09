package com.talkingdata.sdmk.design.pattern.templatepattern;

/**
 * User：    ysl
 * Date:   2018/2/1
 * Time:   10:42
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
