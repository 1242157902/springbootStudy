package com.talkingdata.sdmk.java8.typeSpeculates;

public class TypeInference {
    public static void main(String[] args) {
        final Value< String > value = new Value<>();
        String numStr = value.getOrDefault( "22", Value.defaultValue());
        System.out.println(numStr);
    }
}