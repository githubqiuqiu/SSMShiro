package com.ht.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ht.mapper.LoginMapper;
import com.ht.model.Login;
import com.ht.service.LoginService;

@Transactional
@Service
public class LoginServiceImpl implements LoginService{
	
	@Resource
	private LoginMapper loginmapper;
	
	//查询用户信息
	@Override
	public Login sellogin(String username) {
		
		return loginmapper.sellogin(username);
	}
	
	
}
