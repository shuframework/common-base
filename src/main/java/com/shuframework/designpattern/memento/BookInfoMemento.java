package com.shuframework.designpattern.memento;

import java.util.Date;

/**
 * 备忘录类
 *
 * @author shuheng
 */
public class BookInfoMemento {

    private Integer id;
    private String name;
    private Double price;
    private Date createTime;
    /**
     * 进度
     */
    private String progress;


    //给对象进行备份操作用的
    public BookInfoMemento(BookInfo bookInfo) {
        this.id = bookInfo.getId();
        this.name = bookInfo.getName();
        this.price = bookInfo.getPrice();
        this.createTime = bookInfo.getCreateTime();
        this.progress = bookInfo.getProgress();
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
        return String.format("BookInfoMemento [id=%s, name=%s, price=%s, createTime=%s, progress=%s]", id, name, price, createTime, progress);
    }

}
