package com.in28minutes.rest.webservices.restfulwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	public List<User> findAll()
	{
		return service.findAll();
	}

	@PostMapping("/users")
	public User adding(@RequestBody User user)
	{
		return service.addNew(user);
	}
	
	@GetMapping("/users/{id}") 
	public User retrieveUser(@PathVariable("id") int id)
	{
		return service.findOne(id);
	}	
}
