package com.generation.saborlocal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.saborlocal.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	List<Categoria> findAllByNomeContainingIgnoreCase(String nome);

}
