package com.talkingdata.sdmk.testJson;


import java.util.List;

public class DataSetInformation {

    private int currentPage ;
    private int rows ;
    private long totalCount ;
    private int totalPage ;

    private List<DataSetInfo>  items;


    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<DataSetInfo> getItems() {
        return items;
    }

    public void setItems(List<DataSetInfo> items) {
        this.items = items;
    }
}
