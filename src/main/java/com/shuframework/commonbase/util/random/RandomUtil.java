package com.shuframework.commonbase.util.random;

import java.util.Random;

/**
 * 产生随机数（推荐使用这个来替换MathUtil）,调用使用 RandomUtil.getInstance().random(10);<br/>
 * 底层都是java.util.Random类, 线程安全, 但是多线程下可能性能比较低, 因为Random用了很多CAS的类，ThreadLocalRandom根本没有用到 <br/>
 * 生成的随机数是线性可预测的, 所以在安全性要求比较高的场合，应当使用SecureRandom。
 * @author	shu
 */
public class RandomUtil implements DefaultRandom {
	//Random 的性能不太高，而且可能被预测
	//http://blog.csdn.net/hengyunabc/article/details/9913143

	private RandomUtil(){}

	static RandomUtil randomUtil = new RandomUtil();
	public static RandomUtil getInstance(){
		return randomUtil;
	}

	@Override
	public int random(int num) {
		Random random = new Random();
		return random.nextInt(num);
	}

	
	/**
	 * 返回的几位数的值, 位数不够则补零, length范围 [1, +∞] <br>
	 * 如length=1,返回[0, 10) 即0-9之间的值<br>
	 * 如length=2,返回[00, 100) 即00-99之间的值<br>
	 * 如length=3,返回[000, 1000) 即000-999之间的值<br>
	 * 
	 * @param @param length	几位数
	 * @return int
	 */
	@Deprecated
	public String randomByLength2StrFillZero(int length){
		String randomId = "";
		int restLength = 0;
		int limitLength = 9;
		if(length < 1){
			throw new IllegalArgumentException("超过范围, length范围是[1,+∞)");
		}else if(length <= limitLength){
			restLength = length;
		}else{
			int count = length / limitLength;
			for (int i = 0; i < count; i++) {
				randomId = randomId + randomFillZeroHasLimit(limitLength);
			}
			//加上不满长度的部分
			restLength = length - count * limitLength;
		}
		
		if(restLength != 0){
			randomId = randomId + randomFillZeroHasLimit(restLength);
		}
		
		return randomId;
	}

}
