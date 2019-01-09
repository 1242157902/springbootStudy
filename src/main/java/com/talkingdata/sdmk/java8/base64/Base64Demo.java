package com.talkingdata.sdmk.java8.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * User：    ysl
 * Date:   2018/1/22
 * Time:   11:18
 */
public class Base64Demo {

    public static void main(String[] args){
        final String text = "Base64 finally in Java8!";

        final String encoded = Base64
                        .getEncoder()
                        .encodeToString(text.getBytes(StandardCharsets.UTF_8));

        System.out.println( encoded );

        final String decoded = new String(Base64.getDecoder().decode(encoded),StandardCharsets.UTF_8);

        System.out.println(decoded);
    }
}
