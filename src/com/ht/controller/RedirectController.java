package com.ht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("redirect")
public class RedirectController {
	
	//跳转到首页
	@RequestMapping("toindex")
	public String toindex() {
		return "index";
	}
	
	//跳转到登录界面
	@RequestMapping("tologin")
	public String tologin() {
		return "login";
	}
	
	//无权限的页面
	@RequestMapping("unauthorized")
	public String unauthorized() {
		return "unauthorized";
	}
	

	
	
}
