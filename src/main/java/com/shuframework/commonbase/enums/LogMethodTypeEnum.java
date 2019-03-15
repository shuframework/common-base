package com.shuframework.commonbase.enums;

/**
 * 日志请求方法类型枚举
 */
public enum LogMethodTypeEnum {

	INSERT(1, "insert", "新增"),
	UPDATE(2, "update", "修改"),
	DELETE(3, "delete", "删除"),

	LOGIN(11, "login", "登录"),
	LOGOUT(12, "logout", "登出"),
	IMPORT(13, "import", "导入"),
	EXPORT(14, "export", "导出"),
	AUDIT(15, "audit", "审核");

	private int code;
	private String method; //方法
	private String name;

	LogMethodTypeEnum(int code, String method, String name) {
		this.code = code;
		this.method = method;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getMethod() {
		return method;
	}
}
