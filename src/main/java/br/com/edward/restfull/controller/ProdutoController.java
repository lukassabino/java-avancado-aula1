package br.com.edward.restfull.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.edward.restfull.model.ProdutoModel;
import br.com.edward.restfull.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@PostMapping("/cadastrar")
	public ProdutoModel cadastrar(@RequestBody ProdutoModel model) {
		return produtoService.cadastrar(model);
	}

	@GetMapping("/mostrar-tudo")
	public List<ProdutoModel> mostrarTudo() {
		return produtoService.mostrarTudo();
	}

	@DeleteMapping("/remover")
	public ProdutoModel remover(@RequestParam Long id) {
		return produtoService.remover(id);
	}
}
