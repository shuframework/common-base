package com.shuframework.commonbase.util.random;

import org.junit.Test;

public class RandomUtilTest {
	
	@Test
	public void test6() {
		for (int i = 0; i < 100; i++) {
			String num = RandomUtil.getInstance().randomFillZeroHasLimit(3);
			System.out.println(num);
		}
	}
	
	@Test
	public void randomByLength2Str_test() {
		String num = RandomUtil.getInstance().randomByLength2Str(18);
		System.out.println(num);
	}
	
	@Test
	public void randomByLength2Int_test1() {
		for (int i = 0; i < 100; i++) {
//			int num = RandomUtil.getInstance().randomByLength2Int(3);
			int num = RandomUtil.getInstance().randomByLength2Int(9);
			System.out.println(num);
		}
	}
	
	@Test
	public void random_test2() {
		for (int i = 0; i < 50; i++) {
			int num = RandomUtil.getInstance().random(10, 20);
			System.out.println(num);
		}
	}
	
	@Test
	public void random_test() {
		for (int i = 0; i < 10; i++) {
			int num = RandomUtil.getInstance().random(10);
			System.out.println(num);
		}
	}

}
