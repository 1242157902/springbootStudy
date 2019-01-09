package com.talkingdata.sdmk.design.pattern.abstractfactorypattern;

/**
 * User：    ysl
 * Date:   2017/12/18
 * Time:   18:08
 */
public class ColorFactory extends AbstractFactory {


    /**
     * 使用getColor方法获取对应的颜色
     * @param colorType
     * @return
     */
    @Override
    public Color getColor(String colorType){
        Color color = null;
        if(null == colorType){
            return  null;
        }else {
            colorType = colorType.toUpperCase();
        }
        switch ( colorType){
            case "RED":
                color = new Red();
                break;
            case "BLUE":
                color = new Blue();
                break;
            case "GREEN":
                color = new Green();
                break;
            default:
                break;

        }
        return color;
    }

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){

        return null;
    }
}
