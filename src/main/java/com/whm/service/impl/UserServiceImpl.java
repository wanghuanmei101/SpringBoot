package com.whm.service.impl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.whm.mapper.UserMapper;
import com.whm.pojo.User;
import com.whm.service.UserService;
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper ud ;
	@Override
	public List<User> getUser() {
		List<User> u=ud.getUser();
		if(u!=null){
		return u;
	}
		return null; 
	}

}
