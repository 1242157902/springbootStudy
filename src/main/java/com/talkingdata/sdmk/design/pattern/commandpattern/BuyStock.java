package com.talkingdata.sdmk.design.pattern.commandpattern;

/**
 * User：    ysl
 * Date:   2018/1/15
 * Time:   9:58
 */
public class BuyStock implements Order{

    private Stock abcStock;


    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {

        abcStock.buy();
    }
}
