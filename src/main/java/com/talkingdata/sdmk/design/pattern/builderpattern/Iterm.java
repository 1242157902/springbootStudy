package com.talkingdata.sdmk.design.pattern.builderpattern;

/**
 * 食物条目的接口
 * User：    ysl
 * Date:   2017/12/21
 * Time:   10:44
 */
public interface Iterm {

    public String name();
    public Packing packing();
    public float price();
}
