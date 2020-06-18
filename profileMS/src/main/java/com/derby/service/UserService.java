package com.derby.service;

import java.util.List;

import com.derby.model.User;

public interface UserService {
	User getUserById(Integer id);
	Integer register(User user);
	Integer update(User user);
	Integer delete(User user);
	List<User> searchByName(String Name,int page,int count);
}
