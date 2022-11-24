package br.com.tecsegapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tecsegapi.model.Funcao;

public interface FuncaoRepository extends JpaRepository<Funcao, Integer>{
	
	List<Funcao> findByNomeReduzidoContainingOrderByNomeReduzido(String NomeReduzido);

}

