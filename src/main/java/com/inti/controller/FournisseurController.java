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

import com.inti.entities.Fournisseur;
import com.inti.service.interfaces.IFournisseurService;

@RestController
@RequestMapping(value = "/")
@CrossOrigin(origins = "http://localhost:4200")
public class FournisseurController {

	@Autowired
	IFournisseurService fournisseurServ;
	
	
	@GetMapping(value = "fournisseurs/all")
	public List<Fournisseur> findAll(){
		return fournisseurServ.findAll();
	}
	
	@GetMapping(value = "fournisseurs/{id_Fournisseur}")
	public Fournisseur findOne(@PathVariable ("id_Fournisseur") Long id_Fournisseur) {
		return fournisseurServ.findOne(id_Fournisseur);
	}
	
	@PostMapping(value = "fournisseurs/addFournisseur")
	public Fournisseur save(@RequestBody Fournisseur fournisseur) {
		return fournisseurServ.save(fournisseur);
	}
	
	@DeleteMapping(value = "fournisseurs/{id_Fournisseur}")
	public void delete(@PathVariable ("id_Fournisseur") Long id_Fournisseur) {
		fournisseurServ.delete(id_Fournisseur);
	}
	
	@PutMapping(value = "fournisseurs/{id_Fournisseur}")
	public Fournisseur update (@PathVariable ("id_Fournisseur") Long id_Fournisseur, @RequestBody Fournisseur fournisseur) {
		Fournisseur currentFournisseur = fournisseurServ.findOne(id_Fournisseur);
		currentFournisseur.setNom_fournisseur(fournisseur.getNom_fournisseur());
		currentFournisseur.setMail_fournisseur(fournisseur.getMail_fournisseur());
		currentFournisseur.setIdentifiant(fournisseur.getIdentifiant());
		currentFournisseur.setPassword(fournisseur.getPassword());
		return fournisseurServ.save(currentFournisseur);
	}
}
