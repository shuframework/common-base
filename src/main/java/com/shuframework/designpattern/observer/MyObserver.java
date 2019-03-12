package com.shuframework.designpattern.observer;

/**
 * 观察者接口，为所有的具体观察者定义一个update接口，在得到通知者（或主题）的通知时更新自己
 * 其实jdk已经提供了该接口 java.util.Observer
 */
public interface MyObserver {

	void  update(Subject subject);
}