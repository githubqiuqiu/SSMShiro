package com.ht.model;

public class RoleJurisdiction {
	private Integer rid;
	private Integer jid;
	private String rname;
	private String jname;
	private String jurl;
	
	public String getJurl() {
		return jurl;
	}
	public void setJurl(String jurl) {
		this.jurl = jurl;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	@Override
	public String toString() {
		return "RoleJurisdiction [rid=" + rid + ", jid=" + jid + ", rname=" + rname + ", jname=" + jname + ", jurl="
				+ jurl + "]";
	}
	public RoleJurisdiction(Integer rid, Integer jid, String rname, String jname, String jurl) {
		super();
		this.rid = rid;
		this.jid = jid;
		this.rname = rname;
		this.jname = jname;
		this.jurl = jurl;
	}
	public RoleJurisdiction() {
		super();
	}
	
	
	
	
}
