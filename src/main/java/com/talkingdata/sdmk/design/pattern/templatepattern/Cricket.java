package com.talkingdata.sdmk.design.pattern.templatepattern;

/**
 * User：    ysl
 * Date:   2018/2/1
 * Time:   10:41
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
