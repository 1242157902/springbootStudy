package com.talkingdata.sdmk.design.pattern.vistorpattern;

/**
 * User：    ysl
 * Date:   2018/2/1
 * Time:   16:02
 */
public interface  ComputerPartVisitor {

    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Monitor monitor);
    public void visit(Keyboard keyboard);
}
