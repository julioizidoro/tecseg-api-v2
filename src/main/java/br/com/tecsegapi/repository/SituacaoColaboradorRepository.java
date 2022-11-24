package br.com.tecsegapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tecsegapi.model.SituacaoColaborador;


public interface SituacaoColaboradorRepository extends JpaRepository<SituacaoColaborador, Integer>{
	
	List<SituacaoColaborador> findByNomeContainingOrderByNome(String Nome);

}

