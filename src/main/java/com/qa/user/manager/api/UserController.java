package com.qa.user.manager.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	private User[] allUsers = 
		{
			new User(1, "John", 33),
			new User(2, "James", 45),
			new User(3, "Jane", 24),
			new User(4, "Dan", 22),
			new User(5, "Kane", 43),
			new User(6, "Frank", 64),
			new User(7, "Trent", 31),
			new User(8, "Link", 23),
			new User(9, "Dean", 46)
		};
	
	@GetMapping(value="/users")
	public User[] getAllUsers() {
		return allUsers;
	}
	
}
