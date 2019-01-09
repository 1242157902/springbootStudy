package com.talkingdata.sdmk.design.pattern.vistorpattern;

/**
 * User：    ysl
 * Date:   2018/2/1
 * Time:   16:03
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
