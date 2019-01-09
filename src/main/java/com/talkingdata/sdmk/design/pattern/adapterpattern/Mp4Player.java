package com.talkingdata.sdmk.design.pattern.adapterpattern;

/**
 * User：    ysl
 * Date:   2017/12/26
 * Time:   19:57
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Play mp4 file.Name:" + fileName);
    }
}
