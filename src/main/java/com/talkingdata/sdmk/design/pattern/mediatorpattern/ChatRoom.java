package com.talkingdata.sdmk.design.pattern.mediatorpattern;

import java.util.Date;

/**
 * User：    ysl
 * Date:   2018/1/17
 * Time:   19:54
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
