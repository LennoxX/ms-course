package com.udemy.ms.oauth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.ms.oauth.entities.User;
import com.udemy.ms.oauth.interfaces.UserFeignClient;

@Service
public class UserService {

	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findById(Long id) {
		System.out.println(id);
		return userFeignClient.findById(id).getBody();
	}
}
