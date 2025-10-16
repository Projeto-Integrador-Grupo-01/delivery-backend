package com.generation.saborlocal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.saborlocal.model.Produtor;
import com.generation.saborlocal.repository.ProdutorRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/produtores")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutorController {
	
	@Autowired
	private ProdutorRepository produtorRepository;
	
	@GetMapping
	public ResponseEntity<List<Produtor>> getAll() {
		return ResponseEntity.ok(produtorRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produtor> getById(@PathVariable Long id) {
		return produtorRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Produtor>> getAllByNome(@PathVariable String nome) {
		return ResponseEntity.ok(produtorRepository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Produtor> post(@Valid @RequestBody Produtor produtor) {
		produtor.setId(null);
		return ResponseEntity.status(201).body(produtorRepository.save(produtor));
	}
	
	@PutMapping
	public ResponseEntity<Produtor> put(@Valid @RequestBody Produtor produtor) {
		return produtorRepository.findById(produtor.getId())
				.map(resposta -> ResponseEntity.ok(produtorRepository.save(produtor)))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Optional<Produtor> produtor = produtorRepository.findById(id);
		if (produtor.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		produtorRepository.deleteById(id);
	}
	

}
