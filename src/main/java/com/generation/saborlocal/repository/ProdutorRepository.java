package com.generation.saborlocal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.saborlocal.model.Produtor;

public interface ProdutorRepository extends JpaRepository<Produtor, Long> {
	
	List<Produtor> findAllByNomeContainingIgnoreCase(String nome);

}
