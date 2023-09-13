package com.dnb.devconnector.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnb.devconnector.dto.User;
import com.dnb.devconnector.exceptions.EmailNotFoundException;
import com.dnb.devconnector.repo.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public Optional<User> getUserByEmail(String UserEmail) {
		// TODO Auto-generated method stub
		return userRepository.findById(UserEmail);
	}

	@Override
	public boolean deleteUser(String UserEmail) throws EmailNotFoundException {
		// TODO Auto-generated method stub
		if(userRepository.existsById(UserEmail)==true)
			userRepository.deleteById(UserEmail);
		else
			throw new EmailNotFoundException("Mentioned Email Not Found");
		return true;
	}

	@Override
	public Iterable<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
