package br.com.tecsegapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tecsegapi.model.Partecorpo;

public interface ParteCorpoRespository extends JpaRepository<Partecorpo, Integer>{
	
	List<Partecorpo> findByDescricaoContainingOrderByDescricao(String Descricao);

}