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

import com.inti.entities.Offre;
import com.inti.service.interfaces.IOffreService;

@RestController
@RequestMapping(value = "/")
@CrossOrigin(origins = "http://localhost:4200")
public class OffreController {
	
	@Autowired
	IOffreService offreServ;
	
	
	@GetMapping(value = "offres/all")
	public List<Offre> findAll(){
		return offreServ.findAll();
	}
	
	@GetMapping(value = "offres/{id}")
	public Offre findOne(@PathVariable ("id") Long id) {
		return offreServ.findOne(id);
	}
	
	@PostMapping(value = "offres/addOffre")
	public Offre save(@RequestBody Offre offre) {
		
		return offreServ.save(offre);
	}
	
	@DeleteMapping(value = "offres/{id}")
	public void delete(@PathVariable ("id") Long id) {
		offreServ.delete(id);
	}
	
	@PutMapping(value = "offres/{id}")
	public Offre update (@PathVariable ("id") Long id, @RequestBody Offre offre) {
		Offre currentOffre = offreServ.findOne(id);
		currentOffre.setNom_Offre(offre.getNom_Offre());	
		return offreServ.save(currentOffre);
	}

}
