package com.bw.pojo;

public class Dept {

	private Integer id;
	private String dname;
	public Dept() {
		super();
	}
	public Dept(Integer id, String dname) {
		super();
		this.id = id;
		this.dname = dname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
}
