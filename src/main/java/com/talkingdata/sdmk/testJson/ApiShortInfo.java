package com.talkingdata.sdmk.testJson;

import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;


import java.lang.reflect.Type;
import java.util.List;

public class ApiShortInfo {
    public static Type LIST_TYPE = new TypeReference<HttpResponse<List<ApiShortInfo>>>(){}.getType();

    private Integer id;

    @JSONField(ordinal = 1)
    private String serviceId;
    private String serviceName;

    private Double starLevel;
    private Integer visibleScope;

    @JSONField(ordinal = 5)
    private Integer unitPrice;

    private String providerImgThumbnail;
    private String providerId;
    private String providerName;

    @JSONField(deserialize = false)
    private Integer pricing;
    private String pricingName;

    @JSONField(ordinal = 7)
    private Integer sort;
    @JSONField(ordinal = 8)
    private Object packageModified;
    @JSONField(ordinal = 2)
    private Integer serviceType;

    private String summary;

    public void copy(ApiShortInfo shortInfo) {
        if(shortInfo == null){
            return;
        }

        providerId = shortInfo.getProviderId();
        serviceName = shortInfo.serviceName;
        providerImgThumbnail = shortInfo.providerImgThumbnail;
        providerName = shortInfo.providerName;
        summary = shortInfo.summary;
    }

    @JSONField(name = "serviceId")
    public String getServiceId() {
        return serviceId;
    }

    @JSONField(name = "serviceId")
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @JSONField(name = "serviceName", ordinal = 3)
    public String getServiceName() {
        return serviceName;
    }

    @JSONField(name = "name")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @JSONField(name = "providerLogo")
    public String getProviderImgThumbnail() {
        return providerImgThumbnail;
    }

    @JSONField(name = "logoUrl")
    public void setProviderImgThumbnail(String providerImgThumbnail) {
        this.providerImgThumbnail = providerImgThumbnail;
    }

    public Double getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(Double starLevel) {
        this.starLevel = starLevel;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getPricing() {
        return pricing;
    }

    public void setPricing(Integer pricing) {
        this.pricing = pricing;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @JSONField(name = "serviceType")
    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public Object getPackageModified() {
        return packageModified;
    }

    public void setPackageModified(Object packageModified) {
        this.packageModified = packageModified;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVisibleScope() {
        return visibleScope;
    }

    public void setVisibleScope(Integer visibleScope) {
        this.visibleScope = visibleScope;
    }

    public String getPricingName() {
        return pricingName;
    }

    public void setPricingName(String pricingName) {
        this.pricingName = pricingName;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}

