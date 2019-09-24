package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Client_F;

public interface IClient_fService {
	
public List <Client_F> findAll();
	
	public Client_F findOne(Long idClient_F);
	
	public Client_F save(Client_F Client_F);
	
	public void delete (Long idClient_F);

}
