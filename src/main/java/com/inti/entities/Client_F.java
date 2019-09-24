package com.inti.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client_F {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id_Client;
	public String nom_Client;
	public String prenom_Client;
	public float consoElectrique;

	@ManyToOne
	public Offre offre;

	@Embedded
	public Adresse adresse;
	 
	
	
	

}
