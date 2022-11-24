package br.com.tecsegapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tecsegapi.model.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Integer>{
	
	List<Colaborador> findByNomeContainingOrderByNome(String Nome);

}
