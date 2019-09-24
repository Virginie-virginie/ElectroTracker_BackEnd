package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Origine {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	public int nucleaire;
	public int hydraulique;
	public int gaz;
	public int eolien;
	public int solaire;
	public int biomasse;
	public int charbon;
	
	@JsonIgnore
	@ManyToOne
	public Offre offre;

	
	
	

		
}