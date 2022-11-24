package br.com.tecsegapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tecsegapi.model.Colaborador;

import br.com.tecsegapi.repository.ColaboradorRepository;

@CrossOrigin
@RestController
@RequestMapping("/colaborador")
public class ColaboradorController {
	
	@Autowired
	ColaboradorRepository colaboradorRepository;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Colaborador>> listar() {
		
		List<Colaborador> colaboradores = colaboradorRepository.findByNomeContainingOrderByNome("");
		
		if (colaboradores==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(colaboradores);
	}

}
