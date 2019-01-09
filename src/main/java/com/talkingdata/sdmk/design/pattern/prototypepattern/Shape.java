package com.talkingdata.sdmk.design.pattern.prototypepattern;

/**
 * 创建一个实现了Cloneable接口的抽象类
 * User：    ysl
 * Date:   2017/12/21
 * Time:   14:23
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
