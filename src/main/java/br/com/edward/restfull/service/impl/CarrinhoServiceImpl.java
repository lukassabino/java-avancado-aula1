package br.com.edward.restfull.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.edward.restfull.domain.Carrinho;
import br.com.edward.restfull.domain.ItemCarrinho;
import br.com.edward.restfull.domain.Produto;
import br.com.edward.restfull.service.CarrinhoService;
import br.com.edward.restfull.service.ProdutoService;

@Service
public class CarrinhoServiceImpl implements CarrinhoService {

<<<<<<< HEAD
    private static Carrinho carrinho = new Carrinho();
    
    @Autowired
    private ProdutoService produtoService;
    
    @Override
    public Carrinho adicionar(Integer qtd, Long idProduto) {
        
        Produto produto = produtoService.consultar(idProduto);
        if (Objects.nonNull(produto)) {
            produto.removerEstoque(qtd);
            carrinho.addItem(qtd, produto);
        }
        return carrinho;
    }

    @Override
    public Carrinho mostrarTudo() {
        return carrinho;
    }

    @Override
    public ItemCarrinho remover(Long idItemCarrinho) {

        ItemCarrinho item = carrinho.removerItem(idItemCarrinho);
        item.getProduto().addEstoque(item.getQtd());
        return item;
    }

}
=======
	private static CarrinhoModel carrinho = new CarrinhoModel();

	@Autowired
	private ProdutoService produtoService;

	@Override // Adicionar produto no carrinho
	public CarrinhoModel adicionar(Integer qtd, Long idProduto) {
		ProdutoModel produto = produtoService.consultar(idProduto);
		if (Objects.nonNull(produto) && qtd <= produto.getQtdEstoque()) {
			carrinho.addItem(qtd, produto);
			produto.reduzirEstoque(qtd);
		}
		return carrinho;
	}

	@Override
	public CarrinhoModel mostrarTudo() {
		return carrinho;
	}

	@Override // Remover produto no carrinho
	public ItemCarrinhoModel remover(Integer qtd, Long idItemCarrinho) {
		ProdutoModel produto = produtoService.consultar(idItemCarrinho);
		produto.aumentarEstoque(qtd);
		return carrinho.removerItem(qtd, idItemCarrinho);
	}

}
>>>>>>> 23116bfd79c2cfef4f1a5c3f459537b71a56c52b
