package com.dnb.devconnector.service;

import java.util.Optional;


import org.springframework.stereotype.Service;

import com.dnb.devconnector.dto.User;
import com.dnb.devconnector.exceptions.EmailNotFoundException;



@Service
public interface UserService {
	public User createUser(User user);
	public Optional<User> getUserByEmail(String UserEmail);
	public boolean deleteUser(String UserEmail) throws EmailNotFoundException;
	public Iterable<User> getAllUsers();


}
