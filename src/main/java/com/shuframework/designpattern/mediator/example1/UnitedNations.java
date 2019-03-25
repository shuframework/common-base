package com.shuframework.designpattern.mediator;

/**
 * 联合国机构
 *
 * @author shuheng
 */
public abstract class UnitedNations {

    /**
     * 发申明
     *
     * @param message
     * @param country
     */
    public abstract void declare(String message, Country country);

}
