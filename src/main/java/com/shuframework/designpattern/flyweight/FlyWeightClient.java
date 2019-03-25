package com.shuframework.designpattern.flyweight;

import org.junit.Test;

/**
 * @author shuheng
 */
public class FlyWeightClient {

    @Test
    public void test() {
        int type = 1;
        FlyWeightFactory factory = new FlyWeightFactory();
        ConcreteFlyWeight fwx = factory.getInstance("X");
        fwx.operation(type++);

        ConcreteFlyWeight fwy = factory.getInstance("Y");
        fwy.operation(++type);

        ConcreteFlyWeight fwz = factory.getInstance("Z");
        fwz.operation(++type);

        UnshareConcreteFlyWeight unshareFw1 = new UnshareConcreteFlyWeight();
        unshareFw1.operation(type++);

        UnshareConcreteFlyWeight unshareFw2 = new UnshareConcreteFlyWeight();
        unshareFw2.operation(++type);
    }

    @Test
    public void test2() {
        int type = 1;
        ConcreteFlyWeight fwx = FlyWeightFactory.getInstance("X");
        fwx.operation(++type);

        ConcreteFlyWeight fwy = FlyWeightFactory.getInstance("X");
        fwy.operation(++type);

        ConcreteFlyWeight fwz = FlyWeightFactory.getInstance("Z");
        fwz.operation(++type);

        UnshareConcreteFlyWeight unshareFw1 = new UnshareConcreteFlyWeight();
        unshareFw1.operation(++type);

        UnshareConcreteFlyWeight unshareFw2 = new UnshareConcreteFlyWeight();
        unshareFw2.operation(++type);
    }

}
