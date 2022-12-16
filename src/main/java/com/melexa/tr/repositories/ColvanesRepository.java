package com.melexa.tr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.melexa.tr.entities.Transportadoras;
import com.melexa.tr.model.Colvanes;

@Repository
public interface ColvanesRepository extends JpaRepository<Transportadoras, Integer>{

	
}

