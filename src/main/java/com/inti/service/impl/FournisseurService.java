package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Fournisseur;
import com.inti.repositories.FournisseurRepository;
import com.inti.service.interfaces.IFournisseurService;

@Service
public class FournisseurService implements IFournisseurService {
	
	@Autowired
	FournisseurRepository fournisseurRepository;

	@Override
	public List<Fournisseur> findAll() {
		return fournisseurRepository.findAll();
	}

	@Override
	public Fournisseur findOne(Long id_Fournisseur) {
		return fournisseurRepository.findById(id_Fournisseur).orElse(null);
	}

	@Override
	public Fournisseur save(Fournisseur Fournisseur) {
		return fournisseurRepository.save(Fournisseur);
	}

	@Override
	public void delete(Long id_Fournisseur) {
		fournisseurRepository.deleteById(id_Fournisseur);
		
	}

}
