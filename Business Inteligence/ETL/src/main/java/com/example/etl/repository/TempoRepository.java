package com.example.etl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.etl.entity.Tempo;

public interface TempoRepository extends JpaRepository<Tempo, Integer>{

}
