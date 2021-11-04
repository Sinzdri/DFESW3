package com.qa.user.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.user.domain.User;
import com.qa.user.service.UserServiceList;

@RestController // enables request handling
public class UserController {
	
	@Autowired // instructs spring to inject dependency from the context
	private UserServiceList service; //dependency

	@GetMapping("/hello") // listen for a request at /hello
	public String hello() {
		return "Hello, World!";	//sends response
	}
	
	@PostMapping("/create") // triggered by a POST request to /create
	
	public ResponseEntity<User> createUser(@RequestBody User newUser) { //a user object in the request body
		User responseBody = this.service.createUser(newUser);
		return new ResponseEntity<User>(responseBody, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public List<User> getUser(){
		return this.service.getAllUsers();
	}
	
	@GetMapping("/get/{id}") // getuser with id of id
	public ResponseEntity<User> getUser(@PathVariable int id) {
		if (id >= 0 && id < this.service.getAllUsers().size()) {
		User responseBody = this.service.getUser(id);
		return new ResponseEntity<User>(responseBody, HttpStatus.OK);
		}
		else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
//	@GetMapping("/getByFirstname/{name}")
//	public List<User> getByFirstName(@PathVariable String name) {
//		return this.user.getByFirstName(name);
//	}
	
	@PutMapping("/replace/{id}")
	public ResponseEntity<User> replaceUser(@PathVariable int id, @RequestBody User newUser) {
		System.out.println("Replacing user entry with id " + id + " with user entry " + newUser);
		User responseBody = this.service.replaceUser(id, newUser); //replaces the user at index id
		return new ResponseEntity<User>(responseBody, HttpStatus.ACCEPTED);
	}
	

	
	
//	@Modifying
//	@
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> removeUser(@PathVariable int id){
		if (id >= 0 && id < this.service.getAllUsers().size()) {
		String body = this.service.deleteUser(id);
		return new ResponseEntity<>(body, HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
		}
	}
	

	
	

	
}
