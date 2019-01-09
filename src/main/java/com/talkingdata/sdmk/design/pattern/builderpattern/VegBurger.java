package com.talkingdata.sdmk.design.pattern.builderpattern;

/**
 * User：    ysl
 * Date:   2017/12/21
 * Time:   11:31
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
