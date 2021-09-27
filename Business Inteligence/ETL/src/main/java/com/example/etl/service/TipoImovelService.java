package com.example.etl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.etl.entity.TipoImovel;
import com.example.etl.repository.TipoImovelRepository;

@Service
public class TipoImovelService {

	@Autowired
	private TipoImovelRepository tipoImovelRep;
	
	@Transactional
	public TipoImovel salvar(TipoImovel tipoImovel) {
		return tipoImovelRep.save(tipoImovel);
	}
	
	public List<TipoImovel> listar() {
		return tipoImovelRep.findAll();
	}
	
	public void excluir(TipoImovel tipoImovel) {
		tipoImovelRep.delete(tipoImovel);
	}
	
	public TipoImovel buscarPorId(Integer id) {
		return tipoImovelRep.findById(id).get();
	}
	
}
