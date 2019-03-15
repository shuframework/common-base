package com.shuframework.commonbase.result;

import com.shuframework.commonbase.constant.SystemConstant;

import java.util.List;
import java.util.Map;

/**
 * 分页实体类,实际上com.baomidou.mybatisplus.plugins.Page 已经够用了,
 * 但是某些框架需要返回的字段名需要确定，如easyUI <br>
 * <arrangement>
 * 构建方法 里面对 pageIndex, pageSize 进行了处理
 *
 * <pre>
 * 采用的是Jackson用@JsonIgnore来忽略某字段(com.fasterxml.jackson.annotation.JsonIgnore)
 * 采用的是fastjson用@JSONField来忽略某字段(com.alibaba.fastjson.annotation.JSONField)
 * 采用的是gson用@Expose来忽略某字段(com.google.gson.annotations.Expose)
 * </pre>
 *
 * @author shuheng
 */
public class PageInfo {

    /** 默认起始页数 */
    public static final int PAGE_INDEX_DEFAULT = SystemConstant.PAGE_INDEX_DEFAULT;
    /** 默认每页数量 */
    public static final int PAGE_SIZE_DEFAULT = SystemConstant.PAGE_SIZE_DEFAULT;
    /** 默认排序为asc升序 */
    public static final String ORDERBY_ASC = SystemConstant.ORDERBY_ASC;

    private int total; // 总记录
    private List<?> rows; //显示的记录  

    private int from; // 起始条数 (pageIndex-1) * pageSize
    private int size; // 与pageSize一样

    private int pages; // 总页数

    private int pageIndex; // 当前页 

    private int pageSize; // 每页显示的记录数 

    private Map<String, Object> condition; //查询条件

    private String sort;// 排序字段

    private String order = ORDERBY_ASC;// asc，desc mybatis Order 关键字

//    public PageInfo() {}

    //构造方法
    public PageInfo(Integer pageIndex, Integer pageSize) {
        //计算当前页  
        if (pageIndex == null || pageIndex <= 0) {
            this.pageIndex = PAGE_INDEX_DEFAULT;
        } else {
            //当前页
            this.pageIndex = pageIndex;
        }
        //记录每页显示的记录数  
        if (pageSize == null || pageSize <= 0) {
            this.pageSize = PAGE_SIZE_DEFAULT;
        } else {
            this.pageSize = pageSize;
        }
        //计算开始的记录和结束的记录  
        this.from = (this.pageIndex - 1) * this.pageSize;
        this.size = this.pageSize;
    }

    // 构造方法
    public PageInfo(Integer pageIndex, Integer pageSize, String sort, String order) {
        this(pageIndex, pageSize);
        // 排序字段，正序还是反序
        this.sort = sort;
        this.order = order;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Map<String, Object> getCondition() {
        return condition;
    }

    public void setCondition(Map<String, Object> condition) {
        this.condition = condition;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
