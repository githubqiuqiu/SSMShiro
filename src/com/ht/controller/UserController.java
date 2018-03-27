package com.ht.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ht.model.User;
import com.ht.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Resource(name="userServiceImpl")
	private UserService userservice;
	
	@RequestMapping("tolist")
	public String tolist(Model m) {
		List<User> list=userservice.select();
		m.addAttribute("list", list);
		return "user/list";
	}
	

	
}
