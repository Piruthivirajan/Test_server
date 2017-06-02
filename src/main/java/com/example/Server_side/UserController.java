package com.example.Server_side;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class UserController {

	@RequestMapping(method = RequestMethod.GET)
	public String findItems() {
		return "Hello";

	}
}
