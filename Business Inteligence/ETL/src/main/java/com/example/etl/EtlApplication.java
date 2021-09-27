package com.example.etl;

import java.io.InputStream;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.etl.entity.CaracteristicasImovel;
import com.example.etl.entity.Cliente;
import com.example.etl.entity.Endereco;
import com.example.etl.entity.Tempo;
import com.example.etl.entity.TipoImovel;
import com.example.etl.service.CaracteristicasImovelService;
import com.example.etl.service.ClienteService;
import com.example.etl.service.EnderecoService;
import com.example.etl.service.TempoService;
import com.example.etl.service.TipoImovelService;
import com.example.etl.service.VendaImovelService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

// http://localhost:8080/h2-console/ -> link para acessar o console do banco

@SpringBootApplication
public class EtlApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtlApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TempoService tempoService, TipoImovelService tipoImovelService,
			CaracteristicasImovelService caracteristicasImovelService, ClienteService clienteService,
			EnderecoService enderecoService, VendaImovelService vendaImovelService) {
		return args -> {
			// cria um object mapper
			ObjectMapper objectMapper = new ObjectMapper();
			// carrega o arquivo json em uma input stream
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/imobiliaria.json");
			// lê o objeto json e transforma em um array node
			ArrayNode arrayNode = (ArrayNode) objectMapper.readTree(inputStream);
			// foreach pelo array node
			for(JsonNode jsonNode : arrayNode) {
				// carrega os dados na tabela Tempo
				Tempo tempo = new Tempo();
				tempo.setDia(new Date());
				tempo.setDiaSemana("terça-feira");
				tempo.setSemanaMes(2);
				tempo.setSemanaAno(16);
				tempo.setFeriado(0);
				tempoService.salvar(tempo);
				// carrega os dados na tabela TipoImovel
				TipoImovel tipoImovel = new TipoImovel();
				tipoImovel.setCategoria(jsonNode.findValue("categoria").asText());
				tipoImovel.setStatusImovel(jsonNode.findValue("status").asText());
				tipoImovelService.salvar(tipoImovel);
				// carrega os dados na tabela CaracteristicasImovel
				CaracteristicasImovel caracteristicasImovel = new CaracteristicasImovel();
				if(jsonNode.has("valor_venda") && jsonNode.findValue("valor_venda").asDouble() >= 200000 && jsonNode.findValue("valor_venda").asDouble() <= 300000) {
					caracteristicasImovel.setFaixaValorVenda("Entre 200.000 e 300.000");
				} else {
					caracteristicasImovel.setFaixaValorVenda("0");
				}
				if(jsonNode.has("iptu") && jsonNode.findValue("iptu").asDouble() >= 5 && jsonNode.findValue("iptu").asDouble() <= 15) {
					caracteristicasImovel.setFaixaIPTU("Entre 5 e 15");
				} else {
					caracteristicasImovel.setFaixaIPTU("0");
				}
				if(jsonNode.has("condominio") && jsonNode.findValue("condominio").asDouble() >= 5 && jsonNode.findValue("condominio").asDouble() <= 15) {
					caracteristicasImovel.setFaixaCondominio("Entre 5 e 15");
				} else {
					caracteristicasImovel.setFaixaCondominio("0");
				}
				if(jsonNode.has("area_total") && jsonNode.findValue("area_total").asDouble() >= 5 && jsonNode.findValue("area_total").asDouble() <= 15) {
					caracteristicasImovel.setFaixaAreaTotal("Entre 5 e 15");
				} else {
					caracteristicasImovel.setFaixaAreaTotal("0");
				}
				if(jsonNode.has("area_privativa") && jsonNode.findValue("area_privativa").asDouble() >= 5 && jsonNode.findValue("area_privativa").asDouble() <= 15) {
					caracteristicasImovel.setFaixaAreaPrivativa("Entre 5 e 15");
				} else {
					caracteristicasImovel.setFaixaAreaPrivativa("0");
				}
				caracteristicasImovel.setSacada(jsonNode.findValue("sacada").asText());
				caracteristicasImovel.setPortaria(jsonNode.findValue("portaria").asText());
				caracteristicasImovel.setElevador(jsonNode.findValue("elevador").asText());
				caracteristicasImovel.setChurrasqueira(jsonNode.findValue("churrasqueira").asText());
				caracteristicasImovel.setQuantidadeDormitorios(jsonNode.findValue("dormitorios").asInt());
				caracteristicasImovel.setQuantidadeSuites(jsonNode.findValue("suites").asInt());
				caracteristicasImovel.setQuantidadeVagas(jsonNode.findValue("vagas").asInt());
				caracteristicasImovel.setQuantidadeBanheiros(jsonNode.findValue("banheiros").asInt());
				caracteristicasImovelService.salvar(caracteristicasImovel);
				// carrega os dados na tabela Cliente
				Cliente cliente = new Cliente();
				cliente.setFisicaJuridica(0);
				cliente.setFaixaSalarial("Entre 3 e 5 salários mínimos");
				cliente.setGenero(0);
				clienteService.salvar(cliente);
				// carrega os dados na tabela Endereco
				Endereco endereco = new Endereco();
				endereco.setCEP(jsonNode.findValue("cep").asText());
				endereco.setCidade(jsonNode.findValue("cidade").asText());
				endereco.setEstado(jsonNode.findValue("uf").asText());
				endereco.setEndereco(jsonNode.findValue("endereco").asText());
				endereco.setNumero(jsonNode.findValue("numero").asInt());
				endereco.setComplemento(jsonNode.findValue("complemento").asText());
				endereco.setBairro(jsonNode.findValue("bairro").asText());
				enderecoService.salvar(endereco);
			}
		};
	}
	
}
