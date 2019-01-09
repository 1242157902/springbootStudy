package com.talkingdata.sdmk.testJson;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by tongzhao on 3/22/18.
 */
public class Industry {
    private Integer iId;
    private String iName;

    @JSONField(name = "iId")
    public Integer getiId() {
        return iId;
    }

    @JSONField(name = "industryId")
    public void setiId(Integer iId) {
        this.iId = iId;
    }

    @JSONField(name = "iName")
    public String getiName() {
        return iName;
    }

    @JSONField(name = "industryName")
    public void setiName(String iName) {
        this.iName = iName;
    }
}
