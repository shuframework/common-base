package com.shuframework.designpattern.adapter;

/**
 * 已经存在的接口 需要匹配的接口
 */
public class Adaptee {

	/**
	 * 示意方法，原本已经存在，已经实现的方法
	 */
	public void specificRequest() {
		System.out.println("具体的功能处理");
	}
}

