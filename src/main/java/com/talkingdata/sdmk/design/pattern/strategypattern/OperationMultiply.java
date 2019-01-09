package com.talkingdata.sdmk.design.pattern.strategypattern;

/**
 * User：    ysl
 * Date:   2018/1/31
 * Time:   15:57
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
