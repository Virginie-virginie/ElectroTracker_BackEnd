package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Fournisseur;

public interface IFournisseurService {
	
public List <Fournisseur> findAll();
	
	public Fournisseur findOne(Long id_Fournisseur);
	
	public Fournisseur save(Fournisseur Fournisseur);
	
	public void delete (Long id_Fournisseur);

}
