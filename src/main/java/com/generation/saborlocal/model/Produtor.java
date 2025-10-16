package com.generation.saborlocal.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_produtores")
public class Produtor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatório.")
	private String nome;
	
	@NotBlank(message = "O atributo descrição é obrigatório.")
	private String descricao;
	
	@Column(unique = true)
	@NotBlank(message = "O atributo email é obrigatório.")
	private String email;
	
	@NotBlank(message = "O atributo telefone é obrigatório.")
	private String telefone;
	
	
	private String foto;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produtor", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties(value = "produtor", allowSetters = true)
	private List<Produto> produto;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
	
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public List<Produto> getProduto() {
		return produto;
	}
	
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
}
