package br.com.tecsegapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tecsegapi.model.SituacaoColaborador;
import br.com.tecsegapi.repository.SituacaoColaboradorRepository;

@CrossOrigin
@RestController
@RequestMapping("/situacaocolaborador")
public class SituacaoColaboradorController {
	
	@Autowired
	private SituacaoColaboradorRepository situacaoColaboradorRepository;
	
	@GetMapping("/listar")
	public ResponseEntity<List<SituacaoColaborador>> listar() {
		
		List<SituacaoColaborador> situacoes = situacaoColaboradorRepository.findByNomeContainingOrderByNome("");
		
		if (situacoes==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(situacoes);
	}

}
