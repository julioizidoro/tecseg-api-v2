package br.com.tecsegapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tecsegapi.model.Partecorpo;
import br.com.tecsegapi.repository.ParteCorpoRespository;

@CrossOrigin
@RestController
@RequestMapping("/partecorpo")
public class ParteCorpoController {
	
	@Autowired
	ParteCorpoRespository parteCorpoRespository;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Partecorpo>> listar() {
		
		List<Partecorpo> partesCorpo = parteCorpoRespository.findByDescricaoContainingOrderByDescricao("");
		
		if (partesCorpo==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(partesCorpo);
	}

}
