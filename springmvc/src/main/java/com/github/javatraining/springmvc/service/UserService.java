package com.github.javatraining.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.javatraining.springmvc.entity.User;
import com.github.javatraining.springmvc.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User findUserById(long id) {
		return userRepository.findById(id).get();
	}

	public void createUser(User user) {
		userRepository.save(user);
	}

	public Iterable<User> getUsers() {
		return userRepository.findAll();
	}

	public void deleteUser(long id) {
		userRepository.deleteById(id);
	}

	public void updateUser(User user) {
		userRepository.save(user);
	}

}
