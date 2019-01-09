package com.talkingdata.sdmk.java8.lambda;

import java.lang.annotation.*;

/**
 * User：    ysl
 * Date:   2018/1/17
 * Time:   20:26
 */
public class RepeationgAnnotations {


    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filters{
        Filter[] value();
    }


    @Target( ElementType.TYPE )
    @Retention( RetentionPolicy.RUNTIME )
    @Repeatable( Filters.class )
    public @interface Filter{
        String value();
    }


    @Filter("filter1")
    @Filter("filter2")
    public interface Filterable{

    }

    public static void main(String[] args){
        for(Filter filter :Filterable.class.getAnnotationsByType(Filter.class)){
            System.out.println(filter.value());
        }
    }

}
