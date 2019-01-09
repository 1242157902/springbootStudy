package com.talkingdata.sdmk.design.pattern.builderpattern;

/**
 * 创建实现Iterm接口的抽象类，该类提供默认的功能
 * User：    ysl
 * Date:   2017/12/21
 * Time:   11:25
 */
public abstract class Burger implements Iterm {

    @Override
    public abstract String name()  ;

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price() ;
}
