package br.com.tecsegapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tecsegapi.repository.ObraRespository;
import br.com.tecsegapi.model.Obra;

@CrossOrigin
@RestController
@RequestMapping("/obra")
public class ObraController {
	
	@Autowired
	private ObraRespository obraRepository;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Obra>> listar() {
		
		List<Obra> obras = obraRepository.findAll();
		
		if (obras==null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(obras);
	}

}
