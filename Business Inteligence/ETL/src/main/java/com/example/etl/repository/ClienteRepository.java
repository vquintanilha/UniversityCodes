package com.example.etl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.etl.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
