package com.talkingdata.sdmk.design.pattern.proxypattern;

/**
 * User：    ysl
 * Date:   2018/1/12
 * Time:   10:55
 */
public class RealImage implements Image {



    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void dispaly() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
