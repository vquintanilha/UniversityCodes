package com.example.etl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.etl.entity.Cliente;
import com.example.etl.service.ClienteService;

// http://localhost:8080/cliente -> requisicao http - > get

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@PostMapping(consumes = "application/json")
	public Cliente salvar(@RequestBody Cliente cliente) {
		return clienteService.salvar(cliente);
	}
	
	@PutMapping(consumes = "application/json")
	public Cliente alterar(@RequestBody Cliente cliente) {
		return clienteService.salvar(cliente);
	}
	
	@DeleteMapping(consumes = "application/json")
	public void excluir(@RequestBody Cliente cliente) {
		clienteService.excluir(cliente);
	}
	
	@GetMapping(produces = "application/json")
	public List<Cliente> listar() {
		return clienteService.listar();
	}
	
	@GetMapping(value = "/buscarporid/{id}", produces = "application/json")
	public Cliente buscarPorId(@PathVariable Integer id) {
		return clienteService.buscarPorId(id);
	}
	
}
