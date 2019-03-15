package com.shuframework.commonbase.enums;

/**
 * 分隔符类型的枚举
 * 
 * @author shuheng
 *
 */
public enum SeparatorTypeEnum {

	COMMA(",", "逗号"),
	POINT(".", "点"),
	UNDERLINE("_", "下划线"),
	BLANK(" ", "空格");

	private String code;
	private String msg;

	SeparatorTypeEnum(String code, String msg) {
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
