package com.talkingdata.sdmk.design.pattern.adapterpattern;

/**
 * User：    ysl
 * Date:   2017/12/26
 * Time:   20:04
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void pay(String audioType, String fileName) {

        if(audioType.equals("mp3")){
            System.out.println("Playing mp3 file.Name: " + fileName);
        }else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.pay(audioType,fileName);
        }else{
            System.out.println("Invlid media." + audioType + " format not support");
        }
    }
}
