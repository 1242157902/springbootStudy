package com.talkingdata.sdmk.design.pattern.builderpattern;

/**
 * User：    ysl
 * Date:   2017/12/21
 * Time:   11:29
 */
public abstract class ColdDrink implements Iterm {


    @Override
    public abstract String name()  ;

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price() ;
}
