package com.ht.service.impl;


import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ht.mapper.UserMapper;
import com.ht.model.RoleJurisdiction;
import com.ht.model.User;
import com.ht.service.UserService;

@Transactional
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper usermapper;
	
	@Override
	public List<RoleJurisdiction> seluserrolejurisdiction(Integer rid) {
		
		return usermapper.seluserrolejurisdiction(rid);
	}

	@Override
	public void add(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> select() {
		return usermapper.select();
	}

	

}
