package br.com.edward.restfull.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import br.com.edward.restfull.domain.Farmaceutico;
=======
>>>>>>> 23116bfd79c2cfef4f1a5c3f459537b71a56c52b
import br.com.edward.restfull.model.FarmaceuticoModel;
import br.com.edward.restfull.service.FarmaceuticoService;
import br.com.edward.restfull.service.PessoaService;

@Service
public class FarmaceuticoServiceImpl implements FarmaceuticoService {

<<<<<<< HEAD
    @Autowired
    private PessoaService pessoaService;
    
    @Override
    public Farmaceutico cadastrar(FarmaceuticoModel model) {
        return (Farmaceutico)pessoaService.post(new Farmaceutico(model));
    }

    @Override
    public List<Farmaceutico> mostrarTudo() {
        return pessoaService.mostrarTudo().stream().filter(x -> x instanceof Farmaceutico)
                .map(f -> (Farmaceutico)f).collect(Collectors.toList());
    }
}
=======
	@Autowired
	private PessoaService pessoaService;

	@Override
	public FarmaceuticoModel cadastrar(FarmaceuticoModel model) {
		return (FarmaceuticoModel) pessoaService.post(model);
	}

	@Override
	public List<FarmaceuticoModel> mostrarTudo() {
		return pessoaService.mostrarTudo().stream().filter(x -> x instanceof FarmaceuticoModel)
				.map(f -> (FarmaceuticoModel) f).collect(Collectors.toList());
	}
}
>>>>>>> 23116bfd79c2cfef4f1a5c3f459537b71a56c52b
