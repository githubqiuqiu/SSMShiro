package com.ht.model;


import java.util.Date;

public class User {
	private Integer uid;
	private String uname;
	private Integer age;
	private String sex;
	private Date createtime;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", age=" + age + ", sex=" + sex + ", createtime=" + createtime
				+ "]";
	}
	public User() {
		super();
	}
	public User(String uname, Integer age, String sex, Date createtime) {
		super();
		this.uname = uname;
		this.age = age;
		this.sex = sex;
		this.createtime = createtime;
	}
	public User(Integer uid, String uname, Integer age, String sex, Date createtime) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.age = age;
		this.sex = sex;
		this.createtime = createtime;
	}
	
	
	
}
