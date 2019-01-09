package com.talkingdata.sdmk.design.pattern.factorypattern;

/**
 * User：    ysl
 * Date:   2017/12/18
 * Time:   17:33
 */
public class ShapeFactory1 {

    /**
     * 使用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点
     * @param clazz
     * @return
     * @throws Exception
     */
    public static Object getClass(Class<?extends Shape> clazz)throws Exception{
        Object obj = null;
        obj = Class.forName(clazz.getName()).newInstance();
        return obj;
    }

}
