package com.ht.model;

import java.io.Serializable;

public class Login implements Serializable{
	private Integer id;
	private String username;
	private String password;
	private Integer rid;
	
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public Login(String username, String password, Integer rid) {
		super();
		this.username = username;
		this.password = password;
		this.rid = rid;
	}

	public Login() {
		super();
	}
	
	
}
