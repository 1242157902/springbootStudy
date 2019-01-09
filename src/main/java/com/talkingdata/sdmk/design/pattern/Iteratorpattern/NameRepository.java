package com.talkingdata.sdmk.design.pattern.Iteratorpattern;

/**
 * User：    ysl
 * Date:   2018/1/16
 * Time:   9:54
 */
public class NameRepository implements Container {

    public String names[] = {"Robert" , "John","Julie","Lora"};

    @Override
    public Iterator getIterator() {
        return null;
    }

}

