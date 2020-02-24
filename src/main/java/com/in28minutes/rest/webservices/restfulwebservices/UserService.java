package com.in28minutes.rest.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class UserService {
	
	private static List<User> users= new ArrayList<>();
	
	private static int usersCount=3;
	
	static {
	users.add(new User(1, "maggi", new Date()));
	users.add(new User(2, "jack", new Date()));
	users.add(new User(3, "tom", new Date()));
	}
	
	//printing all
	public List<User> findAll()
	{
		return users;	
	}

	//adding new user
	public User addNew(User user)
	{
		users.add(user);
		return user;
	}

	//retrieving 1 user
	public User findOne(int id) {
		for(User user: users)
		{
			if(user.getId()==id) {
				return user;
			}
		}
	return null;	
	}	
}
