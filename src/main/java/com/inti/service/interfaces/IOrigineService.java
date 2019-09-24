package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Origine;

public interface IOrigineService {
	
public List <Origine> findAll();
	
	public Origine findOne(Long id_origine);
	
	public Origine save(Origine origine);
	
	public void delete (Long id_origine);

}
