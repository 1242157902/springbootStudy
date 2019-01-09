package com.talkingdata.sdmk.study.SingleInstance;

/**
 * User：    ysl
 * Date:   2017/7/22
 * Time:   17:39
 */
public class SingleInstance2 {

    //延迟加载或者懒汉模式
    //使用双重检测机制来解决问题，既保证了不需要同步代码的异步执行性，有保证了单例的效果
    public volatile static SingleInstance2 singleInstance2;

    private SingleInstance2(){}

    public static SingleInstance2 getSingleInstance(){
        try {

            if(singleInstance2==null){
                synchronized(SingleInstance2.class){
                    if(singleInstance2==null){
                        singleInstance2 = new SingleInstance2();
                    }
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return singleInstance2;
    }
}
