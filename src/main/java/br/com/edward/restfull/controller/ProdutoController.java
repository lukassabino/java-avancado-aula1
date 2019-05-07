package br.com.edward.restfull.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.edward.restfull.model.ProdutoModel;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	public static final List<ProdutoModel> lista = new ArrayList<ProdutoModel>();

	@GetMapping("/parame")
	public ProdutoModel param(@RequestParam String nome, @RequestParam Double preco) {
		return new ProdutoModel(nome, preco);
	}

	@GetMapping("/path/{nome}")
	public ProdutoModel path(@PathVariable String nome, Double preco) {
		return new ProdutoModel(nome, preco);
	}

	@PostMapping("/post")
	public ProdutoModel post(@RequestBody ProdutoModel nome) {
		lista.add(nome);
		return nome;
	}

	@GetMapping("/mostrar")
	public List<ProdutoModel> mostrarTudo() {
		return lista;
	}

	@GetMapping("/remover")
	public ProdutoModel remover(@RequestParam Long id) {
		ProdutoModel produtoRemover = null;
		for (ProdutoModel produto : lista) {
			if (id.equals(produto.getId())) {
				produtoRemover = produto;
				break;
			}
		}
		if (Objects.nonNull(produtoRemover)) {
			lista.remove(produtoRemover);
		}
		return produtoRemover;

	}
}
