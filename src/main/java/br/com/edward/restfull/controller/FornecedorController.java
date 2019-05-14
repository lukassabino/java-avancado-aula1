package br.com.edward.restfull.controller;

import java.util.List;
<<<<<<< HEAD
import java.util.stream.Collectors;
=======
>>>>>>> 23116bfd79c2cfef4f1a5c3f459537b71a56c52b

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edward.restfull.model.FornecedorModel;
import br.com.edward.restfull.service.FornecedorService;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {

<<<<<<< HEAD
    @Autowired
    private FornecedorService fornecedorService;
    
    @PostMapping("/cadastrar")
    public FornecedorModel cadastrar(@RequestBody FornecedorModel model) {
        return new FornecedorModel(fornecedorService.cadastrar(model));
    }
    
    @GetMapping("/mostrar-tudo")
    public List<FornecedorModel> mostrarTudo() {
        return fornecedorService.mostrarTudo().stream().map(FornecedorModel::new).collect(Collectors.toList());
    }
}
=======
	@Autowired
	private FornecedorService fornecedorService;

	@PostMapping("/cadastrar")
	public FornecedorModel cadastrar(@RequestBody FornecedorModel model) {
		return fornecedorService.cadastrar(model);
	}

	@GetMapping("/mostrar-tudo")
	public List<FornecedorModel> mostrarTudo() {
		return fornecedorService.mostrarTudo();
	}
}
>>>>>>> 23116bfd79c2cfef4f1a5c3f459537b71a56c52b
