package com.shuframework.commonbase.enums;

/**
 * 进制的枚举
 * 
 * @author shuheng
 *
 */
public enum NumberSystemEnum {

	BINARY_2(2, "二进制"), 
	OCTAL_8(8, "八进制"),
	DECIMALISM_10(10, "十进制"),
	HEX_16(16, "十六进制");
	
	private int code;
	private String msg;

	NumberSystemEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

}
