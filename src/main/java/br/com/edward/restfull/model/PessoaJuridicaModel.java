package br.com.edward.restfull.model;

import java.util.Objects;

public abstract class PessoaJuridicaModel extends PessoaModel {
	private String razaoSocial;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	@Override
	public Boolean getValidarDocumento() {
		return Objects.nonNull(this.getDocumento()) && this.getDocumento().length() == 14;
	}

}
