package com.service.userService.common.security;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		if (username.equals("venki") && password.equals("venki")) {
			return true;
		} else {
			return false;
		}
	}
}
