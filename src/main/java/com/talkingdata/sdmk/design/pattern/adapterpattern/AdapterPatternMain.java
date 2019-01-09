package com.talkingdata.sdmk.design.pattern.adapterpattern;

/**
 * User：    ysl
 * Date:   2017/12/26
 * Time:   20:07
 */
public class AdapterPatternMain {

    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.pay("mp3","beyond the horizon.mp3");
        audioPlayer.pay("mp4","alone.mp4");
        audioPlayer.pay("vlc","far far away.vlc");
        audioPlayer.pay("avi","mind me .avi");
    }
}
