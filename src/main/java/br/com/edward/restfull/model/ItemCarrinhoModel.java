package br.com.edward.restfull.model;

public class ItemCarrinhoModel {
	private String nome;
	private Integer quantidade;
	private Double preco;
	private Long id;
	private static Long count = 1L;
	private ProdutoModel produto;

	public String getNome() {
		return nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public Long getId() {
		return id;
	}

	public static Long getCount() {
		return count;
	}

	public ProdutoModel getProduto() {
		return produto;
	}

	public Double getTotal() {
		return produto.getPreco() * quantidade;
	}

}
