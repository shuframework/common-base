package com.shuframework.jdkdemo.testmodel;

import java.io.Serializable;

/**
 * 普通的pojo
 * 
 * @author shuheng
 *
 */
public class BookInfo3 implements Serializable{
	
	private static final long serialVersionUID = -439721954189063679L;
	
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public BookInfo3() {}
	
	public BookInfo3(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "BookInfo3 [id=" + id + ", name=" + name + "]";
	}
}
