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

import com.example.etl.entity.CaracteristicasImovel;
import com.example.etl.service.CaracteristicasImovelService;

// http://localhost:8080/caracteristicasimovel -> requisicao http - > get

@RestController
@RequestMapping("/caracteristicasimovel")
public class CaracteristicasImovelController {

	@Autowired
	private CaracteristicasImovelService caracteristicasImovelService;
	
	@PostMapping(consumes = "application/json")
	public CaracteristicasImovel salvar(@RequestBody CaracteristicasImovel caracteristicasImovel) {
		return caracteristicasImovelService.salvar(caracteristicasImovel);
	}
	
	@PutMapping(consumes = "application/json")
	public CaracteristicasImovel alterar(@RequestBody CaracteristicasImovel caracteristicasImovel) {
		return caracteristicasImovelService.salvar(caracteristicasImovel);
	}
	
	@DeleteMapping(consumes = "application/json")
	public void excluir(@RequestBody CaracteristicasImovel caracteristicasImovel) {
		caracteristicasImovelService.excluir(caracteristicasImovel);
	}
	
	@GetMapping(produces = "application/json")
	public List<CaracteristicasImovel> listar() {
		return caracteristicasImovelService.listar();
	}
	
	@GetMapping(value = "/buscarporid/{id}", produces = "application/json")
	public CaracteristicasImovel buscarPorId(@PathVariable Integer id) {
		return caracteristicasImovelService.buscarPorId(id);
	}
	
}
