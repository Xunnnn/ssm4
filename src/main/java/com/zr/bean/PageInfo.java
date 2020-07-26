package com.zr.bean;

import java.util.List;

public class PageInfo<T> {
    private List<T> list;
    private int totalCount;
    private int size;     //每页展示条数
    private int totalPage;
    private int currentPage;//当前页

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "list=" + list +
                ", totalCount=" + totalCount +
                ", size=" + size +
                ", totalPage=" + totalPage +
                ", currentPage=" + currentPage +
                '}';
    }
}
