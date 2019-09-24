package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Origine;
import com.inti.repositories.OrigineRepository;
import com.inti.service.interfaces.IOrigineService;

@Service
public class OrigineService implements IOrigineService {
	
	@Autowired
	OrigineRepository origineRepository;
	
	@Override
	public List<Origine> findAll() {
		return origineRepository.findAll();
	}

	@Override
	public Origine findOne(Long id_origine) {
		return origineRepository.findById(id_origine).orElse(null);
	}

	@Override
	public Origine save(Origine origine) {
		return origineRepository.save(origine);
	}

	@Override
	public void delete(Long id_origine) {
		origineRepository.deleteById(id_origine);
		
	}
	
	//Calcul emission

		public float indiceNucleaire(float consoElectrique, int nucleaire) {
			return ((consoElectrique / 100) * nucleaire) * 12;
			
		}
		
		public float indiceHydraulique(float consoElectrique, int hydraulique) {
			return ((consoElectrique / 100) * hydraulique) * 24;
			
		}
		
		public float indiceGaz(float consoElectrique, int gaz) {
			return ((consoElectrique / 100)* gaz) * 490;
			
		}
		
		public float indiceEolien(float consoElectrique, int eolien) {
			return ((consoElectrique / 100) * eolien) * 11;
			
		}
		
		public float indiceSolaire(float consoElectrique, int solaire) {
			return ((consoElectrique / 100)* solaire) * 45;
			
		}
		
		public float indiceBiomasse(float consoElectrique, int biomasse) {
			return ((consoElectrique / 100)* biomasse) * 230;
			
		}
		
		public float indiceCharbon(float consoElectrique, int charbon) {
			return ((consoElectrique / 100)* charbon) * 820;
			
		}
		
		public float indicEcologique(float indiceCharbon, float indiceBiomasse, float indiceSolaire, float indiceEolien, float indiceGaz, float indiceHydraulique, float indiceNucleaire) {
			return indiceCharbon + indiceBiomasse + indiceSolaire + indiceEolien + indiceGaz + indiceHydraulique + indiceNucleaire;
		}
	

}
