package com.talkingdata.sdmk.design.pattern.prototypepattern;

/**
 * ProtypePatternDemo使用ShapeCache类来获取存储在Hashtable中的形状的克隆
 */
public class PrototypePatternDemo {
   public static void main(String[] args) {

      //先加载一次
      ShapeCache.loadCache();

      Shape clonedShape = (Shape) ShapeCache.getShape("1");
      System.out.println("Shape : " + clonedShape.getType());        

      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
      System.out.println("Shape : " + clonedShape2.getType());        

      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
      System.out.println("Shape : " + clonedShape3.getType());

      ShapeCache.clearCache();
   }
}