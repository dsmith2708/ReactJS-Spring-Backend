package com.qa.user.manager.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping(value="/users")
	public String getAllUsers() {
		return "hello";
	}
	
}
