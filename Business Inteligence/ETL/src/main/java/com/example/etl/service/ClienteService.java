package com.example.etl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.etl.entity.Cliente;
import com.example.etl.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRep;
	
	@Transactional
	public Cliente salvar(Cliente cliente) {
		return clienteRep.save(cliente);
	}
	
	public List<Cliente> listar() {
		return clienteRep.findAll();
	}
	
	public void excluir(Cliente cliente) {
		clienteRep.delete(cliente);
	}
	
	public Cliente buscarPorId(Integer id) {
		return clienteRep.findById(id).get();
	}
	
}
