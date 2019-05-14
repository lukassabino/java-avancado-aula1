package br.com.edward.restfull.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import br.com.edward.restfull.domain.Fornecedor;
=======
>>>>>>> 23116bfd79c2cfef4f1a5c3f459537b71a56c52b
import br.com.edward.restfull.model.FornecedorModel;
import br.com.edward.restfull.service.FornecedorService;
import br.com.edward.restfull.service.PessoaService;

@Service
public class FornecedorServiceImpl implements FornecedorService {

<<<<<<< HEAD
    @Autowired
    private PessoaService pessoaService;
    
    @Override
    public Fornecedor cadastrar(FornecedorModel model) {
        return (Fornecedor)pessoaService.post(new Fornecedor(model));
    }

    @Override
    public List<Fornecedor> mostrarTudo() {
        return pessoaService.mostrarTudo().stream().filter(x -> x instanceof Fornecedor)
                .map(f -> (Fornecedor)f).collect(Collectors.toList());
    }

}
=======
	@Autowired
	private PessoaService pessoaService;

	@Override
	public FornecedorModel cadastrar(FornecedorModel model) {
		return (FornecedorModel) pessoaService.post(model);
	}

	@Override
	public List<FornecedorModel> mostrarTudo() {
		return pessoaService.mostrarTudo().stream().filter(x -> x instanceof FornecedorModel)
				.map(f -> (FornecedorModel) f).collect(Collectors.toList());
	}

}
>>>>>>> 23116bfd79c2cfef4f1a5c3f459537b71a56c52b
