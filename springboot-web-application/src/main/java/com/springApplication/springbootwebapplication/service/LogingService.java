package com.springApplication.springbootwebapplication.service;

import org.springframework.stereotype.Component;

@Component
public class LogingService {
	
	//Method for validating user id and password. Next step would be creating an actual DB for this.
	public boolean validateUser(String userId, String password) {
		return userId.equalsIgnoreCase("Anthony") && password.equalsIgnoreCase("JavaPadawan");
	}

}
