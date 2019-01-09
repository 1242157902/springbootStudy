package com.talkingdata.sdmk.design.pattern.adapterpattern;

/**
 * User：    ysl
 * Date:   2017/12/26
 * Time:   19:58
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equals("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equals("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void pay(String audioType, String fileName) {
        if(audioType.equals("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equals("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
