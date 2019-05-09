package br.com.edward.restfull.model;

import java.util.Objects;

public abstract class PessoFisicaModel extends PessoaModel {

	private Boolean usaOculos;

	public Boolean isUsaOculos() {
		return usaOculos;
	}

	public PessoFisicaModel() {
		super();
	}

	public PessoFisicaModel(String nome) {
		super(nome);
	}

	@Override
	public Boolean getValidarDocumento() {
		return Objects.nonNull(super.getDocumento()) && super.getDocumento().length() == 11;
	}
}
