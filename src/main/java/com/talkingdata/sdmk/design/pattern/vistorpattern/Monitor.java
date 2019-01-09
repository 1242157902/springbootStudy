package com.talkingdata.sdmk.design.pattern.vistorpattern;

/**
 * User：    ysl
 * Date:   2018/2/1
 * Time:   16:09
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {

        computerPartVisitor.visit(this);
    }
}
