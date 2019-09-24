package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Fournisseur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id_Fournisseur;
	
	public String mail_fournisseur;
	public String nom_fournisseur;	
	public String identifiant;
	public String password;
	
	@JsonIgnore
	@OneToMany(mappedBy="fournisseur")
	public List<Offre> offre = new ArrayList<Offre>();
	

	
	
	

}
