package com.talkingdata.sdmk.design.pattern.adapterpattern;

/**
 * User：    ysl
 * Date:   2017/12/26
 * Time:   19:56
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Play vlc file.Name:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}
