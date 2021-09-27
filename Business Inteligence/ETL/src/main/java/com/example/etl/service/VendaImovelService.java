package com.example.etl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.etl.entity.VendaImovel;
import com.example.etl.repository.VendaImovelRepository;

@Service
public class VendaImovelService {

	@Autowired
	private VendaImovelRepository vendaImovelRep;
	
	@Transactional
	public VendaImovel salvar(VendaImovel vendaImovel) {
		return vendaImovelRep.save(vendaImovel);
	}
	
	public Iterable<VendaImovel> salvar(List<VendaImovel> vendaImovelList){
		return vendaImovelRep.saveAll(vendaImovelList);
	}
	
	public List<VendaImovel> listar() {
		return vendaImovelRep.findAll();
	}
	
	public void excluir(VendaImovel vendaImovel) {
		vendaImovelRep.delete(vendaImovel);
	}
	
	public VendaImovel buscarPorId(Integer id) {
		return vendaImovelRep.findById(id).get();
	}
	
}
