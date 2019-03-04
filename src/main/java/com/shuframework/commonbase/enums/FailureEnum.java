package com.shuframework.commonbase.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 异常编码枚举
 *  org.springframework.http.HttpStatus
 * 100-199 用于指定客户端应相应的某些动作。
 * 200-299 用于表示请求成功。
 * 300-399 用于已经移动的文件并且常被包含在定位头信息中指定新的地址信息。
 * 400-499 用于指出客户端的错误。
 * 	现在有的编码是400-417,421-426,449,451 为了不冲突，现在的编码从46x 到49x，并扩展到5位。
 * 500-599 用于支持服务器错误。
 * 
 * @author shuheng
 *
 */
public enum FailureEnum {

	TOKEN_WITHOUT_FAILURE(40002, "缺少Token"),
	TOKEN_EXPIRED_FAILURE(40003, "Token过期"),
	NO_PERMISSION_FAILURE(40005, "没权限"),
	VERIFY_LOGIN_FAILURE(40006, "验证码错误"),
	VERIFY_EXPIRE_FAILURE(40007, "验证码过期"),
	LOGIN_FAILURE(40010, "账号不存在或密码错误"),
//	PASSWORD_FAILURE(40011, "密码错误"),
	PASSWORD_CONFIRM_FAILURE(40012, "密码和确认密码不一致"),
	FAIL_LOGIN(40013, "登录失败"),
    USER_LOGINING(40014, "用户正在登录中"),

    
//////===== 401xx 请求要求身份验证(请求参数检查)
    //缺少xx参数时，重写msg 即可
  	PARAMETER_FAILURE(40101, "参数错误"),

  	//也可叫 notfind
	NOTEXIST_FAILURE(40110, "不存在的信息错误"),
	//不推荐, 建议是覆盖NOTEXIST_FAILURE 的msg
//	NOTEXIST_AREA_FAILURE(40111, "地区不存在"),
//	NOTEXIST_DEPT_FAILURE(40112, "企业不存在"),
//	NOTEXIST_USER_FAILURE(40113, "用户不存在"),
//	NOTEXIST_ROLE_FAILURE(40114, "角色不存在"),
//	NOTEXIST_MENU_FAILURE(40115, "菜单权限不存在"),

	EXISTS_FAILURE(40150, "已存在的信息错误"),
	//不推荐, 建议是覆盖EXISTS_FAILURE 的msg
//	EXIST_AREA_FAILURE(40151, "地区已存在"),
//	EXIST_DEPT_FAILURE(40152, "企业已存在"),
//	EXIST_USER_FAILURE(40153, "用户已存在"),
//	EXIST_ROLE_FAILURE(40154, "角色已存在"),
//	EXIST_MENU_FAILURE(40155, "菜单权限已存在"),


//////===== 403xx 检查流程的问题
	INVALID_STATE(40301, "无效状态"), //如 审核未通过
	
	//状态流转之类的验证
	STATE_FLOW_FAILURE(40321, "流程错误"),
	
	//业务限制流转的验证
	BUSINESS_FLOW_FAILURE(40351, "业务错误"),


//////===== 404xx
	REQUEST_FAILURE(40400, "请求异常, 请重试"),

	//////===== 500xx 后端错误
	OPERATION_FAILURE(50001, "操作失败, 请重试或检查参数"),

	//////===== 501xx	异常
	UNKNOWN_ERROR(50101, "未知错误");


	private int code;
	private String msg;

	FailureEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}


	/**
	 * 通过code 获得msg
	 * 
	 * @param code
	 * @return
	 */
	public static String getMsgByCode(int code) {
		for (FailureEnum exceptionCodeEnum : FailureEnum.values()) {
			if (exceptionCodeEnum.getCode() == code) {
				return exceptionCodeEnum.getMsg();
			}
		}
		throw new IllegalArgumentException("No element matches " + code);
	}

	/**
	 * 获得枚举的列表, 格式是{1, "异常1"}
	 * @return
	 */
	public static Map<Integer, String> toMap() {
		Map<Integer, String> map = new HashMap<>();
		for (FailureEnum exceptionCodeEnum : FailureEnum.values()) {
			map.put(exceptionCodeEnum.getCode(), exceptionCodeEnum.getMsg());
		}
		return map;
	}

	/**
	 * 获得枚举的列表, 格式是[{"code": 1, "msg": "异常1"}]
	 * @return
	 */
	public static List<Map<String, Object>> toList() {
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = null;
		for (FailureEnum exceptionCodeEnum : FailureEnum.values()) {
			map = new HashMap<>();
			map.put("code", exceptionCodeEnum.getCode());
			map.put("msg", exceptionCodeEnum.getMsg());
		}
		return list;
	}

}
