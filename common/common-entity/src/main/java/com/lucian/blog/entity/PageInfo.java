package com.lucian.blog.entity;

public class PageInfo {
    private Integer total;

    private Integer currentPage;

    private Integer maxPage;

    private Integer minPage;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(Integer maxPage) {
        this.maxPage = maxPage;
    }

    public Integer getMinPage() {
        return minPage;
    }

    public void setMinPage(Integer minPage) {
        this.minPage = minPage;
    }
}
