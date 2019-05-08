package br.com.edward.restfull.model;

import java.time.ZonedDateTime;

public abstract class PessoaModel {

	private ZonedDateTime dataCriacao;
	private String nome;
	private String documento;
	private String sobrenome;
	private Integer idade;
	private Double peso;
	private Long id;

	public abstract Boolean getValidarDocumento();

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

	public String getDocumento() {
		return documento;
	}
}
