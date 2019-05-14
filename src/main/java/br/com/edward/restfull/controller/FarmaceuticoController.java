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

import br.com.edward.restfull.model.FarmaceuticoModel;
import br.com.edward.restfull.service.FarmaceuticoService;

@RestController
@RequestMapping("/farmaceutico")
public class FarmaceuticoController {

<<<<<<< HEAD
    @Autowired
    private FarmaceuticoService farmaceuticoService;
    
    @PostMapping("/cadastrar")
    public FarmaceuticoModel cadastrar(@RequestBody FarmaceuticoModel model) {
        return new FarmaceuticoModel(farmaceuticoService.cadastrar(model));
    }
    
    @GetMapping("/mostrar-tudo")
    public List<FarmaceuticoModel> mostrarTudo() {
        return farmaceuticoService.mostrarTudo().stream().map(FarmaceuticoModel::new).collect(Collectors.toList());
    }
}
=======
	@Autowired
	private FarmaceuticoService farmaceuticoService;

	@PostMapping("/cadastrar")
	public FarmaceuticoModel cadastrar(@RequestBody FarmaceuticoModel model) {
		return farmaceuticoService.cadastrar(model);
	}

	@GetMapping("/mostrar-tudo")
	public List<FarmaceuticoModel> mostrarTudo() {
		return farmaceuticoService.mostrarTudo();
	}
}
>>>>>>> 23116bfd79c2cfef4f1a5c3f459537b71a56c52b
