package com.talkingdata.sdmk.design.pattern.vistorpattern;

/**
 * User：    ysl
 * Date:   2018/2/1
 * Time:   16:05
 */
public class Computer implements ComputerPart {


    ComputerPart[] parts;


    public Computer( ) {
         parts = new ComputerPart[]{
            new Mouse(),
            new Keyboard(),
            new Monitor()
         };
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0;i < parts.length ; i++){
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
