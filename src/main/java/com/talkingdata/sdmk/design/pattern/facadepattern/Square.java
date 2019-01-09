package com.talkingdata.sdmk.design.pattern.facadepattern;

public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Square::draw()");
   }
}