package br.com.edward.restfull.model;

import java.time.ZonedDateTime;

public class PessoaModel {
	

	private ZonedDateTime dataCriacao;
	private String nome;
	private String sobrenome;
	private int idade;
	private double peso;
	private Long id;

	public long getId() {
		return id;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public double getPeso() {
		return peso;
	}

	public PessoaModel() {
		this.dataCriacao = ZonedDateTime.now();
	}
	
	public PessoaModel(String nome) {
		this();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public ZonedDateTime getDataCriacao() {
		return dataCriacao;
	}
}
