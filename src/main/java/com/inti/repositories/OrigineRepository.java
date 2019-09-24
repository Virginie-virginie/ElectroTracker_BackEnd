package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Offre;
import com.inti.entities.Origine;

@Repository
public interface OrigineRepository extends JpaRepository<Origine, Long> {

	public List <Origine> findByOffre(Offre offre);
}
