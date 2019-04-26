package com.shuframework.commontools.proxy;

import java.lang.reflect.Proxy;

/**
 * jdk动态代理 工具类
 *
 * @author shuheng
 */
public class JdkDynamicUtil {

    /**
     * 创建代理对象
     * 调用示例： JdkDynamicUtil.getProxy(接口名.class, 实际对象);
     *
     * @param interfaces
     * @param realObj
     * @param <T>
     * @return
     */
    public static <T> T getProxy(Class<T> interfaces, T realObj) {
        return (T) Proxy.newProxyInstance(interfaces.getClassLoader(),
                new Class<?>[]{interfaces}, new JdkSimpleInvocationHandler(realObj));
    }

}
