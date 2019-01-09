package com.talkingdata.sdmk.design.pattern.abstractfactorypattern;

/**
 * User：    ysl
 * Date:   2017/12/18
 * Time:   18:12
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        AbstractFactory factory = null;
        if(null == choice){
            return  null;
        }
        choice = choice.toUpperCase();
        switch (choice){
            case  "SHAPE":
                factory = new ShapeFactory();
                break;
            case "COLOR":
                factory = new ColorFactory();
                break;
            default:
                factory =  null;
                break;
        }
        return factory;
    }
}
