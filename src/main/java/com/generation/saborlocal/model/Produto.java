package com.generation.saborlocal.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@Column(length = 100)
	@NotBlank(message = "O atributo nome é obrigatório.")
	@Size(max = 100, message = "O atributo nome deve conter no máximo 100 caracteres.")
	private String nome;
	
	@Column(length = 1000) 
	@NotBlank(message = "O atributo descrição é obrigatório.") 
	@Size(max = 1000, message = "O atributo descrição deve conter no máximo 1000 caracteres.")
	private String descricao;
	
	@NotNull(message = "O atributo preço é obrigatório.")
	private BigDecimal preco;
	
	private int quantidade;
	
	@NotBlank(message = "O atributo foto é obrigatório.")
	private String foto;

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

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
}
