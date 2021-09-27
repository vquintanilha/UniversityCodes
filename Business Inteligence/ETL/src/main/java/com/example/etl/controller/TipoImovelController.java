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

import com.example.etl.entity.TipoImovel;
import com.example.etl.service.TipoImovelService;

// http://localhost:8080/tipoimovel -> requisicao http - > get

@RestController
@RequestMapping("/tipoimovel")
public class TipoImovelController {

	@Autowired
	private TipoImovelService tipoImovelService;
	
	@PostMapping(consumes = "application/json")
	public TipoImovel salvar(@RequestBody TipoImovel tipoImovel) {
		return tipoImovelService.salvar(tipoImovel);
	}
	
	@PutMapping(consumes = "application/json")
	public TipoImovel alterar(@RequestBody TipoImovel tipoImovel) {
		return tipoImovelService.salvar(tipoImovel);
	}
	
	@DeleteMapping(consumes = "application/json")
	public void excluir(@RequestBody TipoImovel tipoImovel) {
		tipoImovelService.excluir(tipoImovel);
	}
	
	@GetMapping(produces = "application/json")
	public List<TipoImovel> listar() {
		return tipoImovelService.listar();
	}
	
	@GetMapping(value = "/buscarporid/{id}", produces = "application/json")
	public TipoImovel buscarPorId(@PathVariable Integer id) {
		return tipoImovelService.buscarPorId(id);
	}
	
}
