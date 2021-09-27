package com.example.etl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.etl.entity.VendaImovel;

public interface VendaImovelRepository extends JpaRepository<VendaImovel, Integer>{
	
}
