package com.shuframework.commonbase.util.random;

import org.junit.Test;

public class ThreadRandomUtilTest {

	@Test
	public void test2() {
		for (int i = 0; i < 50; i++) {
			int num = ThreadRandomUtil.getInstance().random(1, 10);
			if(num == 1 || num == 10){
				System.out.println(num);
			}
		}
	}

}
