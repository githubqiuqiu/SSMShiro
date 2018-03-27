package com.ht.mapper;

import com.ht.base.BaseDao;
import com.ht.model.Login;

public interface LoginMapper extends BaseDao{
		Login sellogin(String username);
}
