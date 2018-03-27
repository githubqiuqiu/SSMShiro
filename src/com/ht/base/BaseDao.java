package com.ht.base;


import java.util.List;
import com.ht.model.User;

public interface BaseDao {
		//增
		void add(User u);
		
		//删
		void delete(Integer id);
		
		//改
		void update(User u);
		
		//查
		List<User> select();
		
		
}
