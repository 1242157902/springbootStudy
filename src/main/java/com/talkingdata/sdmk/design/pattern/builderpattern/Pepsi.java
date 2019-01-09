package com.talkingdata.sdmk.design.pattern.builderpattern;

/**
 * User：    ysl
 * Date:   2017/12/21
 * Time:   11:38
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
