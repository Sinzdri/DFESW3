package com.qa.user.service;

import java.util.List;
import java.util.Optional;

import com.qa.user.domain.User;

public interface UserService {
	public User createUser(User newUser);
	public List<User> getAllUsers();
	public User getUser(int ID);
	public User replaceUser(int ID, User newUser);
	public String deleteUser(int ID);
}
