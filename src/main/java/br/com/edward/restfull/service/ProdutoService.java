package br.com.edward.restfull.service;

import java.util.List;

import br.com.edward.restfull.domain.Produto;
import br.com.edward.restfull.model.ProdutoModel;

public interface ProdutoService {

<<<<<<< HEAD
    Produto consultar(Long idProduto);
    Produto cadastrar(ProdutoModel model);
    List<Produto> mostrarTudo();
    Produto remover(Long id);
    Produto alterar(ProdutoModel model);
}
=======
	ProdutoModel consultar(Long idProduto);

	ProdutoModel cadastrar(ProdutoModel model);

	List<ProdutoModel> mostrarTudo();

	ProdutoModel remover(Long id);
}
>>>>>>> 23116bfd79c2cfef4f1a5c3f459537b71a56c52b
