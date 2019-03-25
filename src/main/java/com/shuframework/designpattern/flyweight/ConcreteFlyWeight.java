package com.shuframework.designpattern.flyweight;

/**
 * @author shuheng
 */
public class ConcreteFlyWeight implements FlyWeight {

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ConcreteFlyWeight(String key){
        this.key = key;
    }


    @Override
    public void operation(int type) {
        System.out.println(key + "具体FlyWeight: " + type);
    }
}
