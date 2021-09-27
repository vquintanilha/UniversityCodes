package com.example.etl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.etl.entity.Endereco;
import com.example.etl.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRep;
	
	@Transactional
	public Endereco salvar(Endereco endereco) {
		return enderecoRep.save(endereco);
	}
	
	public List<Endereco> listar() {
		return enderecoRep.findAll();
	}
	
	public void excluir(Endereco endereco) {
		enderecoRep.delete(endereco);
	}
	
	public Endereco buscarPorId(Integer id) {
		return enderecoRep.findById(id).get();
	}
	
}
