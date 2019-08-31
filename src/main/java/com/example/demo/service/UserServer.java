package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Component
public class UserServer {

	@Autowired
	private UserMapper userMapper;
	

	public List<User> queryUserList() {
		
		List<User> user=userMapper.queryUserList();
		return user;
		
	}
	
}
