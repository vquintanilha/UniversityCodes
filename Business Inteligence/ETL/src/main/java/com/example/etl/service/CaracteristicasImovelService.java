package com.example.etl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.etl.entity.CaracteristicasImovel;
import com.example.etl.repository.CaracteristicasImovelRepository;

@Service
public class CaracteristicasImovelService {

	@Autowired
	private CaracteristicasImovelRepository caracteristicasImovelRep;
	
	@Transactional
	public CaracteristicasImovel salvar(CaracteristicasImovel caracteristicasImovel) {
		return caracteristicasImovelRep.save(caracteristicasImovel);
	}
	
	public List<CaracteristicasImovel> listar() {
		return caracteristicasImovelRep.findAll();
	}
	
	public void excluir(CaracteristicasImovel caracteristicasImovel) {
		caracteristicasImovelRep.delete(caracteristicasImovel);
	}
	
	public CaracteristicasImovel buscarPorId(Integer id) {
		return caracteristicasImovelRep.findById(id).get();
	}
	
}
