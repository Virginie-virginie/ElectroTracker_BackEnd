package com.inti.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Offre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	public String nom_Offre;
	
	@ManyToOne
	public Fournisseur fournisseur;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "offre_id")
	public List <Origine> origines;
	
	@JsonIgnore
	@OneToMany
	@JoinColumn(name = "offre_id")
	public List<Client_F> clients;


	
	
	
	
	
	



	
	
	
}
