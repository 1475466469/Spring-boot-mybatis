package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserServer;

@RestController
public class HomeController {
	@Autowired
	private UserServer userserver;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static Logger log=Logger.getLogger(HomeController.class);
	@RequestMapping("/hello")
	
	public List<Map<String,Object>> name() {
		
	 List<Map<String,Object>> a=jdbcTemplate.queryForList("select * from user");
	 System.out.println(a);
	 log.info("测试log4j");;
	 return a;
		//return userserver.queryUserList();
	}
	
	
}
