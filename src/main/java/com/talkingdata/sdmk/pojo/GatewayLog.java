package com.talkingdata.sdmk.pojo;

/**
 * User：    ysl
 * Date:   2017/5/31
 * Time:   16:29
 */
public class GatewayLog {


    private String appkey;
    private long startts;
    private long endts;

    private int inputCount;
    private int outputCount;
    private String serviceid;
    private int statusinner;
    private int statusouter ;
    private String trackid;
    private String userid;
    private int validCount;

    private String serviceidnorth;
    private String serviceidsouth;


    public GatewayLog() {
    }

    public GatewayLog(String appkey, long startts, long endts,
                      int inputCount, int outputCount, String serviceid,
                      int statusinner, int statusouter, String trackid,
                      String userid, int validCount, String serviceidnorth,
                      String serviceidsouth) {
        this.appkey = appkey;
        this.startts = startts;
        this.endts = endts;
        this.inputCount = inputCount;
        this.outputCount = outputCount;
        this.serviceid = serviceid;
        this.statusinner = statusinner;
        this.statusouter = statusouter;
        this.trackid = trackid;
        this.userid = userid;
        this.validCount = validCount;
        this.serviceidnorth = serviceidnorth;
        this.serviceidsouth = serviceidsouth;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }


    public int getInputCount() {
        return inputCount;
    }

    public void setInputCount(int inputCount) {
        this.inputCount = inputCount;
    }

    public int getOutputCount() {
        return outputCount;
    }

    public void setOutputCount(int outputCount) {
        this.outputCount = outputCount;
    }

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid;
    }

    public int getStatusinner() {
        return statusinner;
    }

    public void setStatusinner(int statusinner) {
        this.statusinner = statusinner;
    }

    public int getStatusouter() {
        return statusouter;
    }

    public void setStatusouter(int statusouter) {
        this.statusouter = statusouter;
    }

    public String getTrackid() {
        return trackid;
    }

    public void setTrackid(String trackid) {
        this.trackid = trackid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getValidCount() {
        return validCount;
    }

    public void setValidCount(int validCount) {
        this.validCount = validCount;
    }

    public long getStartts() {
        return startts;
    }

    public void setStartts(long startts) {
        this.startts = startts;
    }

    public long getEndts() {
        return endts;
    }

    public void setEndts(long endts) {
        this.endts = endts;
    }

    public String getServiceidnorth() {
        return serviceidnorth;
    }

    public void setServiceidnorth(String serviceidnorth) {
        this.serviceidnorth = serviceidnorth;
    }

    public String getServiceidsouth() {
        return serviceidsouth;
    }

    public void setServiceidsouth(String serviceidsouth) {
        this.serviceidsouth = serviceidsouth;
    }

    @Override
    public String toString() {
        return "GatewayLog{" +
                "appkey='" + appkey + '\'' +
                ", startts=" + startts +
                ", endts=" + endts +
                ", inputCount=" + inputCount +
                ", outputCount=" + outputCount +
                ", serviceid='" + serviceid + '\'' +
                ", statusinner=" + statusinner +
                ", statusouter=" + statusouter +
                ", trackid='" + trackid + '\'' +
                ", userid='" + userid + '\'' +
                ", validCount=" + validCount +
                ", serviceidnorth='" + serviceidnorth + '\'' +
                ", serviceidsouth='" + serviceidsouth + '\'' +
                '}';
    }
}
