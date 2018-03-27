package com.ht.mapper;

import java.util.List;

import com.ht.base.BaseDao;
import com.ht.model.RoleJurisdiction;

public interface UserMapper extends BaseDao{
	//根据用户的角色id查询用户拥有的所有权限
	List<RoleJurisdiction> seluserrolejurisdiction(Integer rid);
}
