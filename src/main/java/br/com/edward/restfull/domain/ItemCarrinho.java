package br.com.edward.restfull.domain;

import lombok.Getter;

@Getter
public class ItemCarrinho {

    
    private Long id;
    private Integer qtd;
    private Produto produto;
    private Carrinho carrinho;

    
    public ItemCarrinho(Integer qtd, Produto produto) {
        this();
        this.qtd = qtd;
        this.produto = produto;
    }

    public ItemCarrinho() {
	}

	public Double getTotal() {
        return this.qtd * this.produto.getPreco();
    }
}