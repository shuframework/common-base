package com.shuframework.designpattern.memento;

import java.util.Date;

/**
 * 普通的pojo
 *
 * @author shuheng
 */
public class BookInfo {

    private Integer id;
    private String name;
    private Double price;
    private Date createTime;
    /**
     * 进度
     */
    private String progress;


    public BookInfo() {
    }

    public BookInfo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public BookInfo(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public BookInfo(Integer id, String name, Date createTime) {
        this.id = id;
        this.name = name;
        this.createTime = createTime;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }


    @Override
    public String toString() {
        return String.format("BookInfo [id=%s, name=%s, price=%s, createTime=%s, progress=%s]", id, name, price, createTime, progress);
    }

}
