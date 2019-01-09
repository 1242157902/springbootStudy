package com.talkingdata.sdmk.design.pattern.strategypattern;

/**
 * User：    ysl
 * Date:   2018/1/31
 * Time:   15:57
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int excuteStrategy(int num1, int num2){
        return strategy.doOperation(num1,num2);
    }
}
