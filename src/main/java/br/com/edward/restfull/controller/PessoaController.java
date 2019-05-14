package br.com.edward.restfull.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.PathVariable;
>>>>>>> 23116bfd79c2cfef4f1a5c3f459537b71a56c52b
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.edward.restfull.model.PessoaModel;
import br.com.edward.restfull.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

<<<<<<< HEAD
    @Autowired
    private PessoaService pessoaService;
    
    @GetMapping("/mostrar-tudo")
    public List<PessoaModel> mostrarTudo() {
        return pessoaService.mostrarTudo().stream().map(PessoaModel::new).collect(Collectors.toList());
    }
    
    @DeleteMapping("/remover")
    public PessoaModel remover(@RequestParam Long id) {
        return new PessoaModel(pessoaService.remover(id));
    }
}
=======
	@Autowired
	private PessoaService pessoaService;

	@GetMapping("/param")
	public PessoaModel param(@RequestParam String nome) {
		return new FarmaceuticoModel(nome);
	}

	@GetMapping("/path/{nome}")
	public PessoaModel path(@PathVariable String nome) {
		return new FornecedorModel(nome);
	}

	@GetMapping("/mostrar-tudo")
	public List<PessoaModel> mostrarTudo() {
		return pessoaService.mostrarTudo();
	}

	@DeleteMapping("/remover")
	public PessoaModel remover(@RequestParam Long id) {
		return pessoaService.remover(id);
	}
}
>>>>>>> 23116bfd79c2cfef4f1a5c3f459537b71a56c52b
