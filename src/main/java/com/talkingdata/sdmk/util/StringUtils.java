package com.talkingdata.sdmk.util;


public class StringUtils {

    /**
     * 判断该字符串是否为空，是的话，返回true，否则返回false
     *
     * @param str :字符串
     * @return
     */
    public static boolean isEmpty(String str) {
        if (null != str  && !"".equals(str.trim())) {
            return false;
        } else {
            return true;
        }
    }
}
