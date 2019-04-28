package com.shuframework.jdkdemo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理 工具类
 * 使用示例见 com.shuframework.jdkdemo.proxy.AopProxyBeanTest
 *
 * @author shuheng
 */
public class JdkDynamicUtil {

    /**
     * 创建代理对象
     * 调用示例： JdkDynamicUtil.getProxyBySimpleHandle(实际对象);
     *
     * @param realObj
     * @param <T>
     */
    public static <T> T getProxyBySimpleHandle(T realObj) {
//        Class<?> clz = realObj.getClass();
//        return (T) Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), new JdkSimpleInvocationHandler(realObj));
        return getProxy(realObj, new JdkSimpleInvocationHandler(realObj));
    }


    public static <T> T getProxy(T realObj, InvocationHandler handler) {
        Class<?> clz = realObj.getClass();
        return (T) Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), handler);
    }

}
