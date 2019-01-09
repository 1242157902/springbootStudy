package com.talkingdata.sdmk.design.pattern.builderpattern;

/**
 * User：    ysl
 * Date:   2017/12/21
 * Time:   11:33
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
