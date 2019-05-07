package br.com.edward.restfull.model;

import java.time.ZonedDateTime;

public class ProdutoModel {

	private ZonedDateTime dataCriacao;
	private String nome;
	private Double preco;
	private Long id;
	private static long count = 1L;
	

	public Long getId() {
		return id;
	}

	public Double getPreco() {
		return preco;
	}

	public ProdutoModel() {
		this.dataCriacao = ZonedDateTime.now();
		this.id = count++;
	}

	public ProdutoModel(String nome, Double preco) {
		this();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public ZonedDateTime getDataCriacao() {
		return dataCriacao;
	}
	
}
