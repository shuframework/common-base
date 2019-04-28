package com.shuframework.jdkdemo.proxy;

import com.shuframework.jdkdemo.proxy.logaop.AopProxyBean;
import com.shuframework.jdkdemo.proxy.logaop.MyLogInterceptor;
import org.junit.Test;

/**
 * aop 测试
 * @author shuheng
 */
public class AopProxyBeanTest {

    @Test
    public void aop_test(){
        HelloService helloService = new HelloServiceImpl();
        HelloService proxyBean = (HelloService)AopProxyBean.getProxyBean(helloService, new MyLogInterceptor());
        proxyBean.say("java");
        System.out.println("-----null-----");
        proxyBean.say(null);
    }

}