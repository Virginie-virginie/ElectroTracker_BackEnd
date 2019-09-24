package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Adresse;
import com.inti.entities.User;
import com.inti.repositories.UserRepository;
import com.inti.service.interfaces.IUserService;

@Service
public class UserService implements IUserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	@Override
	public Adresse findByAdresse(String adresse) {
		return userRepository.findByAdresse(adresse);
	}

	@Override
	public User findOne(Long id_User) {
		return userRepository.findById(id_User).orElse(null);
	}

	@Override
	public User save(User User) {
		return userRepository.save(User);
	}

	@Override
	public void delete(Long id_User) {
		userRepository.deleteById(id_User);
		
	}

}
