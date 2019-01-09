package com.talkingdata.sdmk.study.SingleInstance;

/**
 * User：    ysl
 * Date:   2017/7/22
 * Time:   18:10
 */
public class MySingleInstance {


    public enum SingleInstance5{

        connectionFactory;

        private Object object;

        private SingleInstance5() {
            object = new Object();
        }

        public Object getObject(){
            return object;
        }

    }

    public static Object getObject(){
        return SingleInstance5.connectionFactory.getObject();
    }


}
