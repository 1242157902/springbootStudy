package com.talkingdata.sdmk.pojo;

/**
 * User：    ysl
 * Date:   2017/6/1
 * Time:   14:15
 */
public class ServiceGroup {
    private Integer id;

    private String serviceid;

    private String servicename;

    private Integer groupid;

    public ServiceGroup() {
    }

    public ServiceGroup(String serviceid, String servicename, Integer groupid) {
        this.serviceid = serviceid;
        this.servicename = servicename;
        this.groupid = groupid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid == null ? null : serviceid.trim();
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename == null ? null : servicename.trim();
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    @Override
    public String toString() {
        return "ServiceGroup{" +
                "id=" + id +
                ", serviceid='" + serviceid + '\'' +
                ", servicename='" + servicename + '\'' +
                ", groupid=" + groupid +
                '}';
    }
}