package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Client_F;

@Repository
public interface Client_fRepository extends JpaRepository<Client_F, Long>{

}
