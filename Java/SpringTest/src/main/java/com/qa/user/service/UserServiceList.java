package com.qa.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.user.domain.User;

@Service
public class UserServiceList implements UserService{
	private List<User> users = new ArrayList<>();
	
	@Override
	public User createUser (User newuser) {
		this.users.add(newuser);
		return this.users.get(this.users.size() - 1);
	}

	@Override
	public List<User> getAllUsers() {
		return this.users;
	}

	@Override
	public User getUser(int id) {
		return this.users.get(id);
	}

	@Override
	public User replaceUser(int id, User newUser) {
		return this.users.set(id, newUser);
	}

	@Override
	public String deleteUser(int id) {
		if (this.users.size()-1 >= id) {
			this.users.remove(id);
			return "User at index " + id + " deleted";
	}
		else return "Invalid index given, user not found at id " + id;
	}
	
}


