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

import com.example.etl.entity.Tempo;
import com.example.etl.service.TempoService;

// http://localhost:8080/tempo -> requisicao http - > get

@RestController
@RequestMapping("/tempo")
public class TempoController {

	@Autowired
	private TempoService tempoService;
	
	@PostMapping(consumes = "application/json")
	public Tempo salvar(@RequestBody Tempo tempo) {
		return tempoService.salvar(tempo);
	}
	
	@PutMapping(consumes = "application/json")
	public Tempo alterar(@RequestBody Tempo tempo) {
		return tempoService.salvar(tempo);
	}
	
	@DeleteMapping(consumes = "application/json")
	public void excluir(@RequestBody Tempo tempo) {
		tempoService.excluir(tempo);
	}
	
	@GetMapping(produces = "application/json")
	public List<Tempo> listar() {
		return tempoService.listar();
	}
	
	@GetMapping(value = "/buscarporid/{id}", produces = "application/json")
	public Tempo buscarPorId(@PathVariable Integer id) {
		return tempoService.buscarPorId(id);
	}
	
}
