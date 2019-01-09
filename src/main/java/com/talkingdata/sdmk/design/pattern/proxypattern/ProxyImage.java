package com.talkingdata.sdmk.design.pattern.proxypattern;

/**
 * User：    ysl
 * Date:   2018/1/12
 * Time:   10:56
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void dispaly() {

        if(null == realImage){
            realImage = new RealImage(fileName);
        }

        realImage.dispaly();
    }
}
