package com.talkingdata.sdmk.design.pattern.decoratorpattern;

public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }
}