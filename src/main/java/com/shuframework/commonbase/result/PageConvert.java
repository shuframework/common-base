package com.shuframework.commonbase.result;

/**
 * page 转换对象, 处理了pageIndex、pageSize
 * 
 * @author shuheng
 *
 */
public class PageConvert {

	/** 默认起始页数 */
	public static final int PAGE_INDEX_DEFAULT = 1;
	/** 默认每页数量 */
	public static final int PAGE_SIZE_DEFAULT = 10;
	/** 默认排序为asc升序 */
	public static final String ORDERBY_ASC = "asc";
	/** 降序 */
	public static final String ORDERBY_DESC = "desc";

	// 当前页
	private Integer pageIndex; 
	// 每页显示的记录数
	private Integer pageSize; 
	// 排序字段
	private String sortName; 
	// 排序方式
	private String orderBy; 
	// 排序字段和方式(支持多个), 如 id desc
	private String sortAndOrder; 

	public Integer getPageIndex() {
		if (pageIndex == null || pageIndex <= 0) {
			this.pageIndex = PAGE_INDEX_DEFAULT;
		}
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		if (pageSize == null || pageSize <= 0) {
			this.pageSize = PAGE_SIZE_DEFAULT;
		}
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getSortAndOrder() {
		return sortAndOrder;
	}

	public void setSortAndOrder(String sortAndOrder) {
		this.sortAndOrder = sortAndOrder;
	}

}
