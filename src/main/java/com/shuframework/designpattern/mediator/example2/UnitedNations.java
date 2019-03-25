package com.shuframework.designpattern.mediator.example2;

/**
 * 联合国机构
 *
 * @author shuheng
 */
public interface UnitedNations {

    /**
     * 发申明
     *
     * @param dname
     */
    void declare(String dname, String message);

    void register(String dname, Country country);

}
