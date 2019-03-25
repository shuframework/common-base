package com.shuframework.designpattern.mediator.example1;

import java.util.HashMap;
import java.util.Map;

/**
 * 联合国 安理会
 *
 * @author shuheng
 */
public class UnitedNationsAA extends UnitedNations {

    private Map<String, AbstractCountry> map = new HashMap<>();


    /**
     * 发申明
     *
     * @param name
     * @param message
     */
    @Override
    public void declare(String name, String message) {
        for (String key : map.keySet()) {
            if (!key.equals(name)){
                map.get(key).getMessage(message);
            }
        }
    }

    @Override
    public void register(String name, AbstractCountry country) {
        map.put(name, country);
    }
}
