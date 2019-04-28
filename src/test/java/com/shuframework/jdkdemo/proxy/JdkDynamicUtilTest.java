package com.shuframework.jdkdemo.proxy;

import com.shuframework.jdkdemo.proxy.dynamic.JdkDynamicUtil;
import org.junit.Test;

/**
 * @author shuheng
 */
public class JdkDynamicUtilTest {

    @Test
    public void aop_test(){
        HelloService helloService = new HelloServiceImpl();
        HelloService proxyBean = JdkDynamicUtil.getProxyBySimpleHandle(helloService);
        proxyBean.say("java");
    }
}