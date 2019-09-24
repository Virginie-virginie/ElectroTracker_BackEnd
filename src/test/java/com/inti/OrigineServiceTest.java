package com.inti;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.inti.service.impl.OrigineService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrigineServiceTest {
	
	@Test
	public void indiceNucleaire() {
		OrigineService oServ = new OrigineService();
		float consoElectrique = 400;
		int nucleaire = 10;
		float c = oServ.indiceNucleaire(consoElectrique, nucleaire);
		assertEquals(c, 480, 1e-8);
		
	}
	
	@Test
	public void indicEcologique() {
		OrigineService oServ = new OrigineService();
		float indiceCharbon = 10;
		float indiceBiomasse = 10;
		float indiceSolaire = 10;
		float indiceEolien = 10;
		float indiceGaz = 10;
		float indiceHydraulique = 10;
		float indiceNucleaire = 10;
		float c = oServ.indicEcologique(indiceCharbon, indiceBiomasse, indiceSolaire, indiceEolien, indiceGaz, indiceHydraulique, indiceNucleaire);
		assertEquals(c, 70, 1e-8);
	}

}
