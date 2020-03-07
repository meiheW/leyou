package com.leyou.search.pojo;

/**
 * @author meihewang
 * @date 2020/03/08  0:38
 */
public class SearchRequest {

    private String key;

    private Integer page;

    private static final int DEFAULT_SIZE = 20;

    private static final int DEFAULT_PAGE = 1;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public int getSize(){
        return DEFAULT_SIZE;
    }
}
