package com.talkingdata.sdmk.design.pattern.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * User：    ysl
 * Date:   2018/1/15
 * Time:   10:01
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
