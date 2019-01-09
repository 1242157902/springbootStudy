package com.talkingdata.sdmk.design.pattern.adapterpattern;

/**
 * 为媒体播放器和更高级的媒体播放器创建接口
 *
 * User：    ysl
 * Date:   2017/12/26
 * Time:   19:53
 */
public interface MediaPlayer {

    public void pay(String audioType,String fileName);
}
