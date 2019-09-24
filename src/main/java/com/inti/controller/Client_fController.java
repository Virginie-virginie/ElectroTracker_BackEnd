package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Client_F;
import com.inti.service.interfaces.IClient_fService;

@RestController
@RequestMapping(value = "/")
@CrossOrigin(origins = "http://localhost:4200")
public class Client_fController {

	@Autowired
	IClient_fService client_fServ;
	
	
	@GetMapping(value = "clients/all")
	public List<Client_F> findAll(){
		return client_fServ.findAll();
	}
	
	@GetMapping(value = "clients/{id_Client}")
	public Client_F findOne(@PathVariable ("id_Client") Long id_Client) {
		return client_fServ.findOne(id_Client);
	}
	
	@PostMapping(value = "clients/addClient")
	public Client_F save(@RequestBody Client_F client_f) {
		return client_fServ.save(client_f);
	}
	
	@DeleteMapping(value = "clients/{id_Client}")
	public void delete(@PathVariable ("id_Client") Long id_Client) {
		client_fServ.delete(id_Client);
	}
	
	@PutMapping(value = "clients/{id_Client}")
	public Client_F update (@PathVariable ("id_Client") Long id_Client, @RequestBody Client_F client_f) {
		Client_F currentClient_f = client_fServ.findOne(id_Client);
		currentClient_f.setNom_Client(client_f.getNom_Client());
		currentClient_f.setPrenom_Client(client_f.getPrenom_Client());
		return client_fServ.save(currentClient_f);
	}
}
