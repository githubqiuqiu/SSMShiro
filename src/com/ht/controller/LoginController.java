package com.ht.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ht.model.Login;
import com.ht.service.LoginService;


@Controller
@RequestMapping("login")
public class LoginController {
	
	@Autowired
	private LoginService loginServiceImpl;
	
	//判断用户的登录
	@RequestMapping("isuserlogin")
	public String isuserlogin(@RequestParam("username")String username,@RequestParam("password")String password,HttpSession session,HttpServletRequest request) {
		//获得Subject
		Subject subject=SecurityUtils.getSubject();
		
		//获得账号密码令牌
		UsernamePasswordToken token=new UsernamePasswordToken(username,password);
		
		try {
			//登录
			subject.login(token);
			
		} catch (Exception e) {
			//登录失败
			System.out.println("登陆失败: " + e.getMessage());
			request.setAttribute("msg", "账号密码有误 请重新输入");
			return "login";
		}
		
		//查询数据库中的用户信息
		Login login=loginServiceImpl.sellogin(username);
		session.setAttribute("user", login);
		
		//登录成功
		return "redirect:/user/tolist";
	}
}
