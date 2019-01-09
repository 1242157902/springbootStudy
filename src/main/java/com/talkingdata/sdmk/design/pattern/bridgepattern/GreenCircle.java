package com.talkingdata.sdmk.design.pattern.bridgepattern;

/**
 * User：    ysl
 * Date:   2018/1/4
 * Time:   20:16
 */
public class GreenCircle implements  DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
