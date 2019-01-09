package com.talkingdata.sdmk.design.pattern.NullObjectPattern;

/**
 * User：    ysl
 * Date:   2018/1/30
 * Time:   18:55
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name){
        this.name = name;
    }


    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
