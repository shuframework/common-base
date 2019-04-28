package com.shuframework.jdkdemo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 简单实现jdk 动态代理
 *
 * @author shuheng
 */
public class JdkSimpleInvocationHandler implements InvocationHandler {

    //实际对象
    private Object realObj;

    public JdkSimpleInvocationHandler(Object realObj) {
        this.realObj = realObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法调用前 （如打印信息）
        System.out.println("enter class: " + realObj.getClass().getCanonicalName());
        System.out.println("enter method: " + method.getName());
        //执行方法
        Object result = method.invoke(realObj, args);
        //方法调用后 （如关闭操作）
        System.out.println("leave method");
        return result;
    }

}
