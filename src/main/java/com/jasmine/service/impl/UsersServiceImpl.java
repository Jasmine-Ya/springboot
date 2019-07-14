package com.jasmine.service.impl;


import com.jasmine.dao.UsersMapper;
import com.jasmine.pojo.Users;
import com.jasmine.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
	@Autowired
	UsersMapper usersMapper;


	@Override
	public List<Users> getAllUsers() {
		System.err.println(usersMapper==null);
		return usersMapper.getAllUsers();
	}
}
