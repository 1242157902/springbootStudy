package com.talkingdata.sdmk.java8.ParallelArray;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * User：    ysl
 * Date:   2018/1/22
 * Time:   11:29
 */
public class ParallelArrayDemo {

    public static void main(String[] args){
        long[] arrayOfLong = new long [ 20000 ];

        Arrays.parallelSetAll(arrayOfLong,
                index -> ThreadLocalRandom.current().nextInt(100000));

        Arrays.stream( arrayOfLong ).limit( 10 ).forEach(
                i -> System.out.print( i + " " ) );
        System.out.println();

        Arrays.parallelSort( arrayOfLong );
        Arrays.stream( arrayOfLong ).limit( 10 ).forEach(
                i -> System.out.print( i + " " ) );
        System.out.println();

    }
}
