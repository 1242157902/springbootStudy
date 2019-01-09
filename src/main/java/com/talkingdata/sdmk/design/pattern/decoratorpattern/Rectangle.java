package com.talkingdata.sdmk.design.pattern.decoratorpattern;

public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }
}