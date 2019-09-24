package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Client_F;
import com.inti.repositories.Client_fRepository;
import com.inti.service.interfaces.IClient_fService;

@Service
public class Client_fService implements IClient_fService {
	
	@Autowired
	Client_fRepository client_fRepository;

	@Override
	public List<Client_F> findAll() {
		return client_fRepository.findAll();
	}

	@Override
	public Client_F findOne(Long id_Client) {
		return client_fRepository.findById(id_Client).orElse(null);
	}

	@Override
	public Client_F save(Client_F Client_F) {
		return client_fRepository.save(Client_F);
	}

	@Override
	public void delete(Long id_Client) {
		client_fRepository.deleteById(id_Client);
		
	}

}
