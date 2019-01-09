package com.talkingdata.sdmk.design.pattern.facadepattern;

public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Circle::draw()");
   }
}