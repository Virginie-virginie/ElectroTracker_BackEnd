package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Offre;
import com.inti.repositories.OffreRepository;
import com.inti.service.interfaces.IOffreService;

@Service
public class OffreService implements IOffreService {
	
	@Autowired
	OffreRepository offreRepository;
	
	@Override
	public List<Offre> findAll() {
		return offreRepository.findAll();
	}

	@Override
	public Offre findOne(Long id) {
		return offreRepository.findById(id).orElse(null);
	}

	@Override
	public Offre save(Offre Offre) {
		return offreRepository.save(Offre);
	}

	@Override
	public void delete(Long id) {
		offreRepository.deleteById(id);
		
	}
	
	
	
	
	

}
