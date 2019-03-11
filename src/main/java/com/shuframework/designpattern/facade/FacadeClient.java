package com.shuframework.designpattern.facade;

import org.junit.Test;

/**
 * @author shuheng
 */
public class FacadeClient {

    @Test
    public void test(){
        ServiceFacade facade = new ServiceFacade();
        facade.method1();
        System.out.println("================");
        facade.method2();
    }
}
