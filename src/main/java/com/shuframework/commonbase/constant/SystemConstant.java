package com.shuframework.commonbase.constant;

/**
 * 常量类
 * 
 * @author shuheng
 *
 */
public class SystemConstant {

	/** 状态：可用 */
	public static final String DATA_ENABLE_STR = "1";
	/** 状态：禁用 */
	public static final String DATA_DISABLE_STR = "0";
	/** 状态：删除 */
	public static final String DATA_DELETE_STR = "-1";
	//一般负数表示删除
	/** 状态：可用 */
	public static final int DATA_ENABLE_INT = 1;
	/** 状态：禁用 */
	public static final int DATA_DISABLE_INT = 0;
	/** 状态：删除 */
	public static final int DATA_DELETE_INT = -1;

	/** 父id */
	public static final String PID_STR = "0";
	/** 父id */
	public static final int PID_INT = 0;
	/** 父id */
	public static final long PID_LONG = 0L;

	/** 通用yes */
	public static final String YES_STR = "1";
	/** 通用no */
	public static final String NO_STR = "0";
	/** 通用yes */
	public static final int YES_INT = 1;
	/** 通用no */
	public static final int NO_INT = 0;

//	/** 性别：男 */
//	public static final String SEX_MEN_STR = "1";
//	/** 性别：女 */
//	public static final String SEX_WOMEN_STR = "2";
	/** 性别：男 */
	public static final int SEX_MEN_INT = 1;
	/** 性别：女 */
	public static final int SEX_WOMEN_INT = 2;


	/** 默认起始页数 */
	public static final int PAGE_INDEX_DEFAULT = 1;
	/** 默认每页数量 */
	public static final int PAGE_SIZE_DEFAULT = 10;
	/** 默认排序为asc升序 */
	public static final String ORDERBY_ASC = "asc";
	/** 降序 */
	public static final String ORDERBY_DESC = "desc";


	/** 默认密码（明文） */
	public static final String DEFAULT_PASSWORD = "111111";

}
