package com.talkingdata.sdmk.design.pattern.templatepattern;

/**
 * 使用场景：
 *      1、有多个子类公有的方法，且逻辑相同
 *      2、重要的、复杂的方法，可以考虑作为模版方法
 * User：    ysl
 * Date:   2018/2/1
 * Time:   10:32
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract  void endPlay();

    /**
     * 模版
     */
    public final void play(){
        /**
         * 初始化游戏
         */
        initialize();


        /**
         * 开始游戏
         */
        startPlay();


        /**
         * 结束游戏
         */
        endPlay();
    }
}
