package com.talkingdata.sdmk.java8.lambda;

import java.util.Arrays;

/**
 * User：    ysl
 * Date:   2018/1/17
 * Time:   20:07
 */
public class TestLambda {


    public static void main(String[] args){
        Arrays.asList("a","b","c","d").forEach(
                e -> System.out.println(e)
        );
    }
}
