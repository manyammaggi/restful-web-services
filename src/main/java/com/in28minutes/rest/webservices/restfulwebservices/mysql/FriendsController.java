package com.in28minutes.rest.webservices.restfulwebservices.mysql;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendsController {
	
	@Autowired
	private FriendsRepo fp;
	
	@RequestMapping(value = { "friends" }, method = RequestMethod.GET)

	public List<Friends> getAll() {
		return fp.findAll();
	}
	

	@RequestMapping(value = { "friends/{id}" }, method = RequestMethod.GET)
	public Optional<Friends> getone(@PathVariable Long id) {
		return fp.findById(id);
	}

	@RequestMapping(value = { "friends" }, method = RequestMethod.POST)
	public Friends addNew(@RequestBody Friends frnd  ) {
	    return fp.save(frnd);
	}

	@RequestMapping(value = { "friends/{id}" }, method = RequestMethod.PUT)
	public Friends update(@PathVariable Long id, @RequestBody Friends frnd) {
		
		Friends obj = fp.getOne(id);
		obj.setName(frnd.getName());
		obj.setBirthDate(frnd.getBirthDate());
		Friends updobj=fp.save(obj);
		return updobj;
	}
	
	@RequestMapping(value = { "friends/{id}" }, method = RequestMethod.DELETE)
	public Friends del(@PathVariable Long id) {
	    Friends obj = fp.getOne(id);
	    fp.deleteById(id);
	    return obj;
	}
	
}
