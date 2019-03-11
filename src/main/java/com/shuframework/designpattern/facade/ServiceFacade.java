package com.shuframework.designpattern.facade;

/**
 * @author shuheng
 */
public class ServiceFacade {

    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;

    public ServiceFacade(){
        subSystem1 = new SubSystem1();
        subSystem2 = new SubSystem2();
    }

    public void method1(){
        subSystem1.method1();
        subSystem2.method1();
    }

    public void method2(){
        subSystem2.method2();
    }

}
