package com.talkingdata.sdmk.java8.paranamer;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * User：    ysl
 * Date:   2018/1/19
 * Time:   15:26
 */
public class ParameterNames {

    public static void main(String[] args)throws Exception{
        Method method = ParameterNames.class.getMethod("main",String[].class);
        for (final Parameter parameter :method.getParameters())
        {
            System.out.println("Parameter: " + parameter.getName());
        }
    }
}
