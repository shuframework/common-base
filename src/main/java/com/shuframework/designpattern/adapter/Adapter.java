package com.shuframework.designpattern.adapter;

/**
 * 适配器：原理就是 实现接口覆盖实现
 */
public class Adapter implements Target {

	// 持有需要被适配的接口对象
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		//可能转调已经实现了的方法，进行适配
		adaptee.specificRequest();
	}
}

