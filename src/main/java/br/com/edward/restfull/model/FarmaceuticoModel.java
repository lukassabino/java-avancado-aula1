package br.com.edward.restfull.model;

public class FarmaceuticoModel extends PessoFisicaModel {

	private String crf;

	public String getCrf() {
		return crf;
	}

	public FarmaceuticoModel() {
		super();
	}

	public FarmaceuticoModel(String nome) {
		super(nome);
	}

}
