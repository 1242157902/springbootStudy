package com.talkingdata.sdmk.design.pattern.mementopattern;

import java.util.ArrayList;
import java.util.List;

/**
 * User：    ysl
 * Date:   2018/1/18
 * Time:   9:30
 */
public class CareTaker {

    private List<Memento>  mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
