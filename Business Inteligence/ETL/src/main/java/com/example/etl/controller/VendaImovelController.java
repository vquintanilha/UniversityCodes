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

import com.example.etl.entity.VendaImovel;
import com.example.etl.service.VendaImovelService;

// http://localhost:8080/vendaimovel -> requisicao http - > get

@RestController
@RequestMapping("/vendaimovel")
public class VendaImovelController {

	@Autowired
	private VendaImovelService vendaImovelService;
	
	@PostMapping(consumes = "application/json")
	public VendaImovel salvar(@RequestBody VendaImovel vendaImovel) {
		return vendaImovelService.salvar(vendaImovel);
	}
	
	@PutMapping(consumes = "application/json")
	public VendaImovel alterar(@RequestBody VendaImovel vendaImovel) {
		return vendaImovelService.salvar(vendaImovel);
	}
	
	@DeleteMapping(consumes = "application/json")
	public void excluir(@RequestBody VendaImovel vendaImovel) {
		vendaImovelService.excluir(vendaImovel);
	}
	
	@GetMapping(produces = "application/json")
	public List<VendaImovel> listar() {
		return vendaImovelService.listar();
	}
	
	@GetMapping(value = "/buscarporid/{id}", produces = "application/json")
	public VendaImovel buscarPorId(@PathVariable Integer id) {
		return vendaImovelService.buscarPorId(id);
	}
	
}
