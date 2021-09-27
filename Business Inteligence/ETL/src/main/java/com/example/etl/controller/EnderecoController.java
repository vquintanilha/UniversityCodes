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

import com.example.etl.entity.Endereco;
import com.example.etl.service.EnderecoService;

// http://localhost:8080/endereco -> requisicao http - > get

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;
	
	@PostMapping(consumes = "application/json")
	public Endereco salvar(@RequestBody Endereco endereco) {
		return enderecoService.salvar(endereco);
	}
	
	@PutMapping(consumes = "application/json")
	public Endereco alterar(@RequestBody Endereco endereco) {
		return enderecoService.salvar(endereco);
	}
	
	@DeleteMapping(consumes = "application/json")
	public void excluir(@RequestBody Endereco endereco) {
		enderecoService.excluir(endereco);
	}
	
	@GetMapping(produces = "application/json")
	public List<Endereco> listar() {
		return enderecoService.listar();
	}
	
	@GetMapping(value = "/buscarporid/{id}", produces = "application/json")
	public Endereco buscarPorId(@PathVariable Integer id) {
		return enderecoService.buscarPorId(id);
	}
	
}
