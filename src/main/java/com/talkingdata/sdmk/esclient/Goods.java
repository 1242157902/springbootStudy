package com.talkingdata.sdmk.esclient;

public class Goods {
    private Integer id;
    private String name;  
    private String goodsId;
      
    public Goods() {  
        super();  
    }

    public Goods(Integer id, String name, String goodsId) {
        this.id = id;
        this.name = name;
        this.goodsId = goodsId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }
}