package com.talkingdata.sdmk.java8.optional;

import java.util.Optional;

/**
 * 为了解决空指针异常
 *          通过检查空值的方式，来防止代码污染
 *
 *
 * User：    ysl
 * Date:   2018/1/19
 * Time:   15:35
 */
public class OptionalDemo {

    public static void main(String[] args){
        demo1();
        demo2();
    }


    public static  void demo1(){
        Optional<String>  fullName = Optional.ofNullable(null);
        System.out.println("Full Name is set ?" + fullName.isPresent());
        System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) );
        System.out.println( fullName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
    }


    public static void demo2(){
        Optional< String > firstName = Optional.of("Tom" );
        System.out.println( "First Name is set? " + firstName.isPresent() );
        System.out.println( "First Name: " + firstName.orElseGet(() -> "[none]" ) );
        System.out.println( firstName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
        System.out.println();
    }
}
