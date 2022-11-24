package br.com.tecsegapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tecsegapi.model.Obra;

public interface ObraRespository extends JpaRepository<Obra, Integer>{
	
	List<Obra> findAll();

}
