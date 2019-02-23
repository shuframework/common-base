package com.shuframework.commonbase.util.random;


import org.junit.Test;

public class SecureRandomUtilTest {

	@Test
	public void test5() {

		for (int i = 0; i < 5000; i++) {
			String num = SecureRandomUtil.getInstance().randomByLength2Str(3);
//			System.out.println(num);
			if(num.equals("100") || num.equals("999")){
				System.out.println(num);
			}
		}
	}
	
	@Test
	public void test3() {
//		int num = SecureRandomUtil.randomByLength2Int(10);
//		System.out.println(num); //java.lang.IllegalArgumentException: 超过范围, length范围是[1,10)
		
		for (int i = 0; i < 500; i++) {
			int num = SecureRandomUtil.getInstance().randomByLength2Int(2);
//			System.out.println(num);
			if(num == 10 || num == 99){
				System.out.println(num);
			}
		}
	}
	
	@Test
	public void test2() {
		for (int i = 0; i < 100; i++) {
			int num = SecureRandomUtil.getInstance().random(10);
			System.out.println(num);
//			if(num == 0 || num == 10){
//				System.out.println(num);
//			}
		}
	}
	
	@Test
	public void test() {
		for (int i = 0; i < 100; i++) {
			int num = SecureRandomUtil.getInstance().random(1, 10);
//			System.out.println(num);
			if(num == 1 || num == 10){
				System.out.println(num);
			}
		}
	}

}
