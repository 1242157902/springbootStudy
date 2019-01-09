package com.talkingdata.sdmk.design.pattern.observerpattern;

/**
 * User：    ysl
 * Date:   2018/1/19
 * Time:   12:00
 */
public class BinaryObserver extends Observer {


    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
