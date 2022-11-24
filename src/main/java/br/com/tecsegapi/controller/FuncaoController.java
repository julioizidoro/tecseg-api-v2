package br.com.tecsegapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tecsegapi.model.Funcao;
import br.com.tecsegapi.repository.FuncaoRepository;

@CrossOrigin
@RestController
@RequestMapping("/funcao")
public class FuncaoController {
	
	@Autowired
	FuncaoRepository funcaoRepository;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Funcao>> listar() {
		
		List<Funcao> funcoes = funcaoRepository.findByNomeReduzidoContainingOrderByNomeReduzido("");
		
		if (funcoes==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(funcoes);
	}

}
