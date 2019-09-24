package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Adresse;
import com.inti.entities.User;

public interface IUserService {
	
public List <User> findAll();
	
	public User findOne(Long id_User);
	
	public Adresse findByAdresse (String adresse);
	
	public User save(User User);
	
	public void delete (Long id_User);

}
