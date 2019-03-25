package com.shuframework.designpattern.mediator.example3;

/**
 * 联合国机构
 *
 * @author shuheng
 */
public interface UnitedNations {

    /**
     * 发申明
     *
     * @param name
     */
    void declare(String name, String message);

    void register(String name, AbstractCountry country);

}
