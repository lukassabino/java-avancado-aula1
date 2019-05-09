package br.com.edward.restfull.model;

public class FornecedorModel extends PessoaJuridicaModel {

	private String representacao;

	public String getRepresentacao() {
		return representacao;
	}

	public FornecedorModel() {
		super();
	}

	public FornecedorModel(String nome) {
		super(nome);
	}
}
