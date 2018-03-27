package com.ht.model;

public class Jurisdiction {
	private Integer id;
	private Integer jid;
	private String jname;
	private String jurl;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public String getJurl() {
		return jurl;
	}
	public void setJurl(String jurl) {
		this.jurl = jurl;
	}
	@Override
	public String toString() {
		return "Jurisdiction [id=" + id + ", jid=" + jid + ", jname=" + jname + ", jurl=" + jurl + "]";
	}
	public Jurisdiction(Integer jid, String jname, String jurl) {
		super();
		this.jid = jid;
		this.jname = jname;
		this.jurl = jurl;
	}
	public Jurisdiction() {
		super();
	}
	
	
	
}
