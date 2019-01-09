package com.talkingdata.sdmk.design.pattern.strategypattern;

/**
 * User：    ysl
 * Date:   2018/1/31
 * Time:   15:55
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
