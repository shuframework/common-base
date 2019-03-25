package com.shuframework.designpattern.mediator.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * 联合国 安理会
 *
 * @author shuheng
 */
public class UnitedNationsAA implements UnitedNations {

    private Map<String, Country> map = new HashMap<>();


    /**
     * 发申明
     *
     * @param dname
     * @param message
     */
    @Override
    public void declare(String dname, String message) {
        for (String key : map.keySet()) {
            if (!key.equals(dname)){
                map.get(key).getMessage(message);
            }
        }
    }

    @Override
    public void register(String dname, Country country) {
        map.put(dname, country);
    }

}
