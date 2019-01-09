package com.talkingdata.sdmk.testJson;


/**
 * 开发：李冰心
 * 时间：2017年07月06日
 * 邮箱：libingxin2013@outlook.com
 * 电话：156 5071 9638
 * 代码如果任何问题欢迎咨询
 */
public class HttpResponse<T> {
    private int status;
    private String msg;
    private T data;

    public HttpResponse() {
    }

    public HttpResponse(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public HttpResponse(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }




}
