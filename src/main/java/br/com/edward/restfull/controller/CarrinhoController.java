package br.com.edward.restfull.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.edward.restfull.model.ItemCarrinhoModel;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

	public static final List<ItemCarrinhoModel> listaCarrinho = new ArrayList<ItemCarrinhoModel>();

	@PostMapping("/post")
	public ItemCarrinhoModel post(@RequestBody ItemCarrinhoModel id) {
		listaCarrinho.add(id);
		return id;
	}

	@GetMapping("/mostrar")
	public List<ItemCarrinhoModel> mostrarTudo() {
		return listaCarrinho;
	}

	@GetMapping("/remover")
	public ItemCarrinhoModel remover(@RequestParam Long id) {
		ItemCarrinhoModel produtoRemover = null;
		for (ItemCarrinhoModel produto : listaCarrinho) {
			if (id.equals(produto.getId())) {
				produtoRemover = produto;
				break;
			}
		}
		return produtoRemover;
	}

}
