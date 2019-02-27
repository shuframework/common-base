package com.shuframework.commonbase.util.random;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * 安全性很高的随机数
 * @author shuheng
 *
 */
public class SecureRandomUtil implements DefaultRandom {

	private SecureRandomUtil(){}

	static SecureRandomUtil randomUtil = new SecureRandomUtil();
	public static SecureRandomUtil getInstance(){
		return randomUtil;
	}

	private static SecureRandom secureRandom;
	static {
		try {
			secureRandom = SecureRandom.getInstance("SHA1PRNG");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 返回的范围是[0,num)
	 * @param num	随机数种子
	 * @return
	 */
	@Override
	public int random(int num){
		//建议采用静态对象来执行
//		SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
		return secureRandom.nextInt(num);
	}
	
}
