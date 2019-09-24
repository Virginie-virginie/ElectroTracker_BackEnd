package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.User;
import com.inti.service.interfaces.IUserService;

@RestController
@RequestMapping(value = "/")
public class UserController {
	
	@Autowired
	IUserService userServ;
	
	
	@GetMapping(value = "users/all")
	public List<User> findAll(){
		return userServ.findAll();
	}
	
	@GetMapping(value = "users/{id_User}")
	public User findOne(@PathVariable ("id_User") Long id_User) {
		return userServ.findOne(id_User);
	}
	
	/*@GetMapping(value = "users/{adresse}")
	public User findByAdresse(@PathVariable ("adresse") Adresse adresse) {
		return userServ.findByAdresse(adresse);
	}*/
	
	@PostMapping(value = "users/addUser")
	public User save(@RequestBody User User) {
		return userServ.save(User);
	}
	
	@DeleteMapping(value = "users/{id_User}")
	public void delete(@PathVariable ("id_User") Long id_User) {
		userServ.delete(id_User);
	}
	
	@PutMapping(value = "users/{id_User}")
	public User update (@PathVariable ("id_User") Long id_User, @RequestBody User user) {
		User currentUser = userServ.findOne(id_User);
		currentUser.setPseudo(user.getPseudo());	
		currentUser.setMail(user.getMail());	
		return userServ.save(currentUser);
	}

}
