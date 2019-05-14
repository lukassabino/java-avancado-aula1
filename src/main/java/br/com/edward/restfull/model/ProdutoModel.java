package br.com.edward.restfull.model;

import br.com.edward.restfull.domain.Produto;
import lombok.Getter;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
@NoArgsConstructor
@Getter
public class ProdutoModel {
    
    private Long id;
    private String nome;
    private Double preco;
    private Integer qtd;
    
    public ProdutoModel(Produto domain) {
        this.id = domain.getId();
        this.nome = domain.getNome();
        this.preco = domain.getPreco();
        this.qtd = domain.getQtd();
    }
}
=======
	public Double getPreco() {
		return preco;
	}

	public Integer getQtdEstoque() {
		return qtdEstoque;
	}

	// Retirar produto do estoque quando acionar no carrinho.
	public void reduzirEstoque(Integer qtd) {
		this.qtdEstoque = this.qtdEstoque - qtd;
	}

	// Incluir produto no estoque depois de remover no carrinho.
	public void aumentarEstoque(Integer qtd) {
		this.qtdEstoque = this.qtdEstoque + qtd;
	}

}
>>>>>>> 23116bfd79c2cfef4f1a5c3f459537b71a56c52b
