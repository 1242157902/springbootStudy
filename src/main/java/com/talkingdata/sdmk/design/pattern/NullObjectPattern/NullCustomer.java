package com.talkingdata.sdmk.design.pattern.NullObjectPattern;

/**
 * User：    ysl
 * Date:   2018/1/30
 * Time:   18:56
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "No Available in Customer Database.";
    }
}
