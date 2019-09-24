package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Offre;

public interface IOffreService {
	
public List <Offre> findAll();
	
	public Offre findOne(Long id);
	
	public Offre save(Offre Offre);
	
	public void delete (Long id);
	

}
