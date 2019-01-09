package com.talkingdata.sdmk.testJson;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by tongzhao on 3/22/18.
 */
public class Tag {

    private Integer tId;
    private String tName;
    private Integer sort;

   @JSONField(name = "tSort")
    public Integer getSort() {
        return sort;
    }

    @JSONField(name = "sort")
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @JSONField(name = "tId")
    public int getTagId() {
        return tId;
    }

    @JSONField(name = "id")
    public void setTagId(int tagId) {
        this.tId = tagId;
    }

    @JSONField(name = "tName")
    public String getTagName() {
        return tName;
    }

    @JSONField(name = "name")
    public void setTagName(String tagName) {
        this.tName = tagName;
    }

}
