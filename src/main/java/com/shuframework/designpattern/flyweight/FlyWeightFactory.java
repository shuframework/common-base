package com.shuframework.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例工厂类
 *
 * @author shuheng
 */
public class FlyWeightFactory {

//    private Map<String, ConcreteFlyWeight> map = new HashMap<>();
//     版本一：构造创建一批
//    public FlyWeightFactory(){
//        //添加一批共享的对象
//        map.put("X", new ConcreteFlyWeight());
//        map.put("Y", new ConcreteFlyWeight());
//        map.put("Z", new ConcreteFlyWeight());
//    }
//
//    public ConcreteFlyWeight getInstance(String key){
//        return map.get(key);
//    }

    private static Map<String, ConcreteFlyWeight> map = new HashMap<>();
    public static ConcreteFlyWeight getInstance(String key) {
        ConcreteFlyWeight fw = map.get(key);
        if (fw == null) {
            fw = new ConcreteFlyWeight(key);
            map.put(key, fw);
        }
        return fw;
    }
}
