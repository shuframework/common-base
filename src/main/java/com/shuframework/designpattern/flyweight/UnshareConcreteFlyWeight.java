package com.shuframework.designpattern.flyweight;

/**
 * @author shuheng
 */
public class UnshareConcreteFlyWeight implements FlyWeight {
    @Override
    public void operation(int type) {
        System.out.println("不共享的具体FlyWeight: " + type);
    }
}
