package com.example.etl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.etl.entity.Tempo;
import com.example.etl.repository.TempoRepository;

@Service
public class TempoService {
	
	@Autowired
	private TempoRepository tempoRep;

	@Transactional
	public Tempo salvar(Tempo tempo) {
		return tempoRep.save(tempo);
	}
	
	public List<Tempo> listar() {
		return tempoRep.findAll();
	}
	
	public void excluir(Tempo tempo) {
		tempoRep.delete(tempo);
	}
	
	public Tempo buscarPorId(Integer id) {
		return tempoRep.findById(id).get();
	}
	
}
