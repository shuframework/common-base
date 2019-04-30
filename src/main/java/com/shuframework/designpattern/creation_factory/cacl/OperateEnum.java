package com.shuframework.designpattern.creation_factory.cacl;

/**
 * 算法的枚举
 * 
 * @author shuheng
 *
 */
public enum OperateEnum {

	ADD("+", "加法"),
	SUBTRACT("-", "减法"),
	MULTIPLY("*", "乘法"),
	DIVIDE("/", "除法");

	private String code;
	private String msg;

	OperateEnum(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

}
