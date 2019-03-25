package com.shuframework.designpattern.mediator.example2;

/**
 * 国家 抽象类
 *
 * @author shuheng
 */
public interface Country {

    /**
     * 申明
     *
     * @param message
     */
    void declare(String message);

    /**
     * 接收信息
     * @param message
     */
    void getMessage(String message);

}
