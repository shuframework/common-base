package com.shuframework.jdkdemo.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author shuheng
 */
//@Target({ElementType.TYPE})
//只有一个值时可以简写
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SimpleSingleton {
}

//注解可以理解为是一个标识，通过标识来判断在容器或业务里进行实现
//注解实现单例的原理是 用一个map 来缓存创建的对象，触发创建时先取缓存然后才是创建新对象，注意需要控制并发