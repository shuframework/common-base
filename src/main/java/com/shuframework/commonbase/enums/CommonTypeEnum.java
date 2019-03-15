package com.shuframework.commonbase.enums;

/**
 * 通用类型的枚举
 * 
 * @author shuheng
 *
 */
public enum CommonTypeEnum {

	ZERO("0", "状态/类型0"),
	ONE("1", "状态/类型1"),
	TWO("2", "状态/类型2"),
	THREE("3", "状态/类型3"),
	FOUR("4", "状态/类型4"),
	FIVE("5", "状态/类型5");

	private String code;
	private String msg;

	CommonTypeEnum(String code, String msg) {
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
