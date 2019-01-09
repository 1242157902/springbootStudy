package com.talkingdata.sdmk.testJson;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by tongzhao on 3/22/18.
 */
public class Category {
    private Integer cId;
    private String cName;

    @JSONField(name = "cId")
    public int getId() {
        return cId;
    }

    @JSONField(name = "categoryId")
    public void setId(int id) {
        this.cId = id;
    }

    @JSONField(name = "cName")
    public String getName() {
        return cName;
    }

    @JSONField(name = "categoryName")
    public void setName(String name) {
        this.cName = name;
    }
}
