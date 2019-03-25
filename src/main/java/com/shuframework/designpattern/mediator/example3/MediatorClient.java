package com.shuframework.designpattern.mediator.example3;

import org.junit.Test;

/**
 * @author shuheng
 */
public class MediatorClient {

    @Test
    public void test() {
        //具体中介者
        UnitedNationsAA mediator = new UnitedNationsAA();
        //具体对象 认识中介者
        USA usa = new USA(mediator);
        Iraq iraq = new Iraq(mediator);

        usa.declare("不准研发核武器");
        System.out.println("-------------");
        iraq.declare("我们没有核武器");
    }

}
