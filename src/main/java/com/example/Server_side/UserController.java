package com.example.Server_side;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class UserController {

	private UserRepository userresository;
	@RequestMapping(method = RequestMethod.GET)
	public List<User> findall() {
		return userresository.findAll();
	}
	
}
