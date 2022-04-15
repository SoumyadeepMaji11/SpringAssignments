package com.training.service;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.training.model.User;

@Service
public class UserService {

	  
	  JdbcTemplate jdbcTemplate;
	  
	 @Autowired
	 public UserService( DataSource dataSource){
		 jdbcTemplate = new JdbcTemplate(dataSource);
	  }
	  
		public void registerUser(User user) {
			String sql = "INSERT INTO users(userid,password) VALUES('"+user.getUserId()+"','"+user.getPassword()+"')";	
			jdbcTemplate.update(sql);
		}
		
		
		
		public String loginUser(User user) {
			String sql = "SELECT userId FROM users WHERE userId=? AND password=?";
			try {
				String userId = jdbcTemplate.queryForObject(sql, new Object[] {
						user.getUserId(), user.getPassword() }, String.class);
				return userId;
				
			} catch (Exception e) {
				return null;
			}
				
		}
		
}
