package com.shuframework.commonbase.util.random;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 多线程并发生成随机数
 * 底层是java.util.concurrent.ThreadLocalRandom
 * @author shuheng
 *
 */
public class ThreadRandomUtil implements DefaultRandom {

	private ThreadRandomUtil(){}

	static ThreadRandomUtil randomUtil = new ThreadRandomUtil();
	public static ThreadRandomUtil getInstance(){
		return randomUtil;
	}

	//线程安全,产生一个静态对象,多线程竞争资源时不浪费资源
	static ThreadLocalRandom threadRandom = ThreadLocalRandom.current();
	
	@Override
	public int random(int num){
		return threadRandom.nextInt(num);
	}
	
}
