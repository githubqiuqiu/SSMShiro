package com.ht.service;

import com.ht.model.Login;

public interface LoginService {
	//根据用户名查询用户信息 判断账号密码是否匹配
	Login sellogin(String username);
}
