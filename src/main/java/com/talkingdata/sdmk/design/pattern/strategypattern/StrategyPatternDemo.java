package com.talkingdata.sdmk.design.pattern.strategypattern;

/**
 * User：    ysl
 * Date:   2018/1/31
 * Time:   15:59
 */
public class StrategyPatternDemo {

    public static void main(String[] args){
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.excuteStrategy(10,5));
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.excuteStrategy(10,5));
        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.excuteStrategy(10,5));

    }
}
