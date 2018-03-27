package com.ht.model;

public class Role {
	private Integer id;
	private Integer rid;
	private String rname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", rid=" + rid + ", rname=" + rname + "]";
	}
	public Role(Integer rid, String rname) {
		super();
		this.rid = rid;
		this.rname = rname;
	}
	public Role() {
		super();
	}
	
	
}
