package com.inti.entities;

import javax.persistence.Embeddable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

@Embeddable
public class Adresse {
	
	public String rue;
	public String ville;
	public String code_postal;
	public String pays;	

}
