package br.com.edward.restfull.model;

public class ProdutoModel {

	private static Long cont = 0L;

	private final Long id;
	private String nome;
	private Double preco;
	private Integer qtdEstoque;

	public ProdutoModel() {
		this.id = ++cont;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getQtdEstoque() {
		return qtdEstoque;
	}

	//Retirar produto do estoque quando acionar no carrinho.
	public void reduzirEstoque(Integer qtd) {
		this.qtdEstoque = this.qtdEstoque - qtd;
	}

	//Incluir produto no estoque depois de remover no carrinho.
	public void aumentarEstoque(Integer qtd) {
		this.qtdEstoque = this.qtdEstoque + qtd;
	}

}