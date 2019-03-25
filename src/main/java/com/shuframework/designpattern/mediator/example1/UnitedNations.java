package com.shuframework.designpattern.mediator.example1;

/**
 * 联合国机构
 *
 * @author shuheng
 */
public abstract class UnitedNations {

    /**
     * 发申明
     *
     * @param name
     * @param message
     */
    public abstract void declare(String name, String message);

    public abstract void register(String name, AbstractCountry country);

}
