package com.talkingdata.sdmk.design.pattern.facadepattern;

public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Rectangle::draw()");
   }
}