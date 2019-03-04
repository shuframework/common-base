package com.shuframework.commonbase.result;

import com.shuframework.commonbase.enums.FailureEnum;
import com.shuframework.commonbase.util.SystemUtil;
import com.shuframework.commonbase.util.ValidateUtil;

/**
 * 返回结果的工具类，包含了错误码
 *
 * @author shuheng
 */
public class ResultUtil {

    public static final int SUCCESS_CODE = 20000;
    public static boolean SUCCESS_BOOL = true;
    public static boolean FAILURE_BOOL = false;

//    public static final String QUERY_OK = "QueryOk";
//    public static final String ADD_OK = "AddOk";
//    public static final String UPDATE_OK = "UpdateOk";
//    public static final String DELETE_OK = "DeleteOk";
//    public static final String OPERATE_OK = "OperateOk";

    public static final String QUERY_OK = "查询成功";
    public static final String ADD_OK = "添加成功";
    public static final String UPDATE_OK = "修改成功";
    public static final String DELETE_OK = "删除成功";
    public static final String OPERATE_OK = "操作成功";

    public static final String ADD_FAIL = "添加失败";
    public static final String UPDATE_FAIL = "修改失败";
    public static final String DELETE_FAIL = "删除失败";


    /**
     * 请求成功，返回msg,data为参数具体值
     *
     * @param msg
     * @param data
     * @return
     */
    public static Result success(String msg, Object data) {
        return new Result(SUCCESS_BOOL, SUCCESS_CODE, msg, data);
    }
    /**
     * 请求成功，返回msg是"OPERATE_OK", data为参数具体值
     *
     * @param data
     * @return
     */
    public static Result success(Object data) {
//        return new Result(SUCCESS_BOOL, SUCCESS_CODE, OPERATE_OK, data);
        return success(OPERATE_OK, data);
    }
    /**
     * 请求成功，返回data为null
     *
     * @return
     */
    public static Result success() {
//        return new Result(SUCCESS_BOOL, SUCCESS_CODE, OPERATE_OK);
		return success(null);
    }

    /**
     * 新增成功
     * @param data
     * @return
     */
    public static Result successOfInsert(Object data) {
        return success(ADD_OK, data);
    }

    /**
     * 修改成功
     * @param data
     * @return
     */
    public static Result successOfUpdate(Object data) {
        return success(UPDATE_OK, data);
    }

    /**
     * 删除成功
     * @param data
     * @return
     */
    public static Result successOfDelete(Object data) {
        return success(DELETE_OK, data);
    }

    /**
     * 请求失败
     *
     * @param code
     * @param msg
     * @param data
     * @return
     */
    public static Result failure(int code, String msg, Object data) {
        return new Result(FAILURE_BOOL, code, msg, data);
    }
    /**
     * 请求失败
     *
     * @param failureEnum
     * @param msg
     * @return
     */
    public static Result failure(FailureEnum failureEnum, String msg, Object data) {
		int code = failureEnum.getCode();
		if (SystemUtil.isEmpty(msg)){
			msg = failureEnum.getMsg();
		}
		return new Result(FAILURE_BOOL, code, msg, data);
    }

    /**
     * 请求失败
     *
     * @param failureEnum
     * @param msg
     * @return
     */
    public static Result failure(FailureEnum failureEnum, String msg) {
        return failure(failureEnum, msg, null);
    }
    /**
     * 请求失败
     *
     * @param failureEnum
     * @return
     */
    public static Result failure(FailureEnum failureEnum) {
        return failure(failureEnum, null);
    }

    /**
     * 新增失败
     * @return
     */
    public static Result failureOfInsert(Object data) {
        return failure(FailureEnum.OPERATION_FAILURE, ADD_FAIL, data);
    }

    /**
     * 修改失败
     * @param data
     * @return
     */
    public static Result failureOfUpdate(Object data) {
        return failure(FailureEnum.OPERATION_FAILURE, UPDATE_FAIL, data);
    }

    /**
     * 删除成功
     * @param data
     * @return
     */
    public static Result failureOfDelete(Object data) {
        return failure(FailureEnum.OPERATION_FAILURE, DELETE_FAIL, data);
    }

    /**
     * 请求出错
     *
     * @param failureEnum
     * @param data
     * @return
     */
    public static Result error(FailureEnum failureEnum, Object data) {
        int code = failureEnum.getCode();
        String msg = failureEnum.getMsg();
        return new Result(FAILURE_BOOL, code, msg, data);
    }
    /**
     * 请求出错
     *
     * @param failureEnum
     * @return
     */
    public static Result error(FailureEnum failureEnum) {
        return error(failureEnum, null);
    }

    /**
     * 未知错误
     *
     * @return
     */
    public static Result unknownError() {
        return error(FailureEnum.UNKNOWN_ERROR);
    }
    /**
     * 未知错误
     *
     * @param data
     * @return
     */
    public static Result unknownError(Object data) {
        return error(FailureEnum.UNKNOWN_ERROR, data);
    }


}
