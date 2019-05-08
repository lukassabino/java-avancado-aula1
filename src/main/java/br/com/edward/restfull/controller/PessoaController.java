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

import br.com.edward.restfull.model.FarmaceuticoModel;
import br.com.edward.restfull.model.FornecedorModel;
import br.com.edward.restfull.model.PessoaModel;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	private static List<PessoaModel> lista = new ArrayList<PessoaModel>();

	@GetMapping("/param")
	public PessoaModel param(@RequestParam String nome) {
		return new FarmaceuticoModel(nome);
	}

	@GetMapping("/path/{nome}")
	public PessoaModel path(@PathVariable String nome) {
		return new FornecedorModel(nome);
	}

	@PostMapping("/post")
	public PessoaModel post(@RequestBody PessoaModel model) {
		lista.add(model);
		return model;
	}

	@GetMapping("/mostrar-tudo")
	public List<PessoaModel> mostrarTudo() {
		return lista;
	}

	@GetMapping("/remover")
	public PessoaModel remover(@RequestParam Long id) {
		PessoaModel pessoaRemover = null;
		for (PessoaModel item : lista) {
			if (id.equals(item.getId())) {
				pessoaRemover = item;
				break;
			}
		}
		if (Objects.nonNull(pessoaRemover)) {
			lista.remove(pessoaRemover);
		}
		return pessoaRemover;

	}
}
