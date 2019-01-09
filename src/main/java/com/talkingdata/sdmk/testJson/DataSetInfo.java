package com.talkingdata.sdmk.testJson;

import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by tongzhao on 3/20/18.
 */
public class DataSetInfo extends ApiShortInfo {

    public static Type LIST_TYPE = new TypeReference<HttpResponse<DataSetInfo>>(){}.getType();

    private List<Category> categoryLabel;
    private List<Industry> industryLabel;
    private String datasetId;
    private String datasetName;


    private Long cnt;
    private String cntName;

    private Long tCreated;
    private Long tModifed;

    private String description;
    private Integer heatSort;

    private long sz;
    private String szName;

    private List<Tag> tags;


    public String getDatasetName() {
        return datasetName;
    }

    @JSONField(name = "name")
    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    public String getDatasetId() {
        return datasetId;
    }

    @JSONField(name = "id")
    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    @JSONField(name = "cnt")
    public long getCnt() {
        return cnt;
    }

    @JSONField(name = "count")
    public void setCnt(long cnt) {
        this.cnt = cnt;
    }

    @JSONField(name = "cntName")
    public String getCntName() {
        return cntName;
    }

    @JSONField(name = "countName")
    public void setCntName(String cntName) {
        this.cntName = cntName;
    }

    @JSONField(name = "tCreated")
    public Long gettCreated() {
        return tCreated;
    }

    @JSONField(name = "sourceCreated")
    public void settCreated(Long tCreated) {
        this.tCreated = tCreated;
    }

    @JSONField(name = "tModified")
    public Long gettModifed() {
        return tModifed;
    }

    @JSONField(name = "category")
    public List<Category> getCategoryLabel() {
        return categoryLabel;
    }

    @JSONField(name = "categoryRelations")
    public void setCategoryLabel(List<Category> categoryLabel) {
        this.categoryLabel = categoryLabel;
    }

    @JSONField(name = "industry")
    public List<Industry> getIndustryLabel() {
        return industryLabel;
    }

    @JSONField(name = "industryRelations")
    public void setIndustryLabel(List<Industry> industryLabel) {
        this.industryLabel = industryLabel;
    }

    @JSONField(name = "sourceModified")
    public void settModifed(Long tModifed) {
        this.tModifed = tModifed;
    }

    @JSONField(name = "description")
    public String getDescription() {
        return description;
    }

    @JSONField(name = "description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JSONField(name = "sz")
    public long getSz() {
        return sz;
    }

    @JSONField(name = "size")
    public void setSz(long sz) {
        this.sz = sz;
    }

    @JSONField(name = "szName")
    public String getSzName() {
        return szName;
    }

    @JSONField(name = "sizeName")
    public void setSzName(String szName) {
        this.szName = szName;
    }

    public List<Tag> getTags() {
        return tags;
    }

    @JSONField(name = "heatSort")
    public Integer getHeatSort() {
        return heatSort;
    }

    @JSONField(name = "heatSort")
    public void setHeatSort(Integer heatSort) {
        this.heatSort = heatSort;
    }

    @JSONField(name = "tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
