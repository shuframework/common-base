package com.shuframework.commonbase.util;

import org.junit.Test;

public class SystemUtilTest {
	
	@Test
	public void getNewFilename_test() {
		String oldFileName = "aa.xls";
		//17011114403356760983.xls
		String newFilename = SystemUtil.getNewFileName(oldFileName);
		System.out.println(newFilename);
	}
	
	@Test
	public void getRandomId_test() {
		//18位
		String randomId1 = SystemUtil.getRandomId();
		//20位
		String randomId2 = SystemUtil.getRandomId(8);
		
		//22位：报异常
		String randomId3 = SystemUtil.getRandomId(10);

		System.out.println(randomId1.length() + "位：" + randomId1);
		System.out.println(randomId2.length() + "位：" + randomId2);
		System.out.println(randomId3.length() + "位：" + randomId3);
	}
	

	@Test
	public void verifycode_test() {
		for (int i = 0; i < 50; i++) {
			Integer verifycode = SystemUtil.verifyCode();
			System.out.println(verifycode);
		}
	}

	@Test
	public void verifyCodeHasLetter_test() {
		for (int i = 0; i < 50; i++) {
			String verifycode = SystemUtil.verifyCodeHasLetter();
			System.out.println(verifycode);
		}
	}
	
}
