package com.talkingdata.sdmk.design.pattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * User：    ysl
 * Date:   2018/1/19
 * Time:   11:58
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        observers.parallelStream()
                .forEach(observer -> observer.update());
    }
}
