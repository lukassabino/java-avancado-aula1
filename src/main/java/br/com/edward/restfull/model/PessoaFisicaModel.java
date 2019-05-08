package br.com.edward.restfull.model;

import java.util.Objects;

public abstract class PessoaFisicaModel extends PessoaModel {
	private Boolean usaOculos;

	public Boolean getUsaOculos() {
		return usaOculos;
	}

	@Override
	public Boolean getValidarDocumento() {
		return Objects.nonNull(super.getDocumento()) && super.getDocumento().length() == 11;
	}

	public PessoaFisicaModel() {
		super();
	}

	public PessoaFisicaModel(String nome) {
		super(nome);
	}

}
