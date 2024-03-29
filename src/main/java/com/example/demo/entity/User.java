package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class User {
	private Integer id;//主键
	private String username;//用户名
	private String password;//密码
	private String name;//姓名
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
