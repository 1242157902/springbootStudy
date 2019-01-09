package com.talkingdata.sdmk.design.pattern.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * User：    ysl
 * Date:   2017/12/21
 * Time:   11:38
 */
public class Meal {

    private List<Iterm> iterms = new ArrayList<Iterm>();


    public void addItem(Iterm iterm){
        iterms.add(iterm);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Iterm iterm : iterms){
            cost += iterm.price();
        }
        return cost;
    }

    public void showItems(){
        for (Iterm iterm : iterms){
            System.out.print("Iterm: " + iterm.name());
            System.out.print(", Packing: " + iterm.packing().pack());
            System.out.println(", Price: " + iterm.price());
        }
    }
}
