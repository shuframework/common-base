package com.shuframework.designpattern.flyweight;

/**
 * @author shuheng
 */
public class ConcreteFlyWeight implements FlyWeight {
    @Override
    public void operation(int type) {
        System.out.println("具体共享FlyWeight: " + type);
    }
}
