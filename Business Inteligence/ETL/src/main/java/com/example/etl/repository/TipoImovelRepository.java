package com.example.etl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.etl.entity.TipoImovel;

public interface TipoImovelRepository extends JpaRepository<TipoImovel, Integer> {

}
