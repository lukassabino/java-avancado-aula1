package br.com.edward.restfull.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import br.com.edward.restfull.domain.Pessoa;
import br.com.edward.restfull.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService {

<<<<<<< HEAD
    private static List<Pessoa> lista = new ArrayList<>();
    
    @Override
    public Pessoa post(Pessoa model) {
        Pessoa pessoa = this.consultar(model.getId());
        if (Objects.isNull(pessoa)) {
            lista.add(model);
            return model;
        }
        throw new RuntimeException("Pessoa já existe");
    }

    @Override
    public Pessoa consultar(Long idPessoa) {
        return lista.stream().filter(item -> idPessoa.equals(item.getId())).findAny().orElse(null);
    }
    
    @Override
    public List<Pessoa> mostrarTudo() {
        return lista;
    }

    @Override
    public Pessoa remover(Long id) {
        Pessoa pessoaRemover = this.consultar(id);
        if (Objects.nonNull(pessoaRemover)) {
            lista.remove(pessoaRemover);
        }
        return pessoaRemover;
    }
}
=======
	private static List<PessoaModel> lista = new ArrayList<>();

	@Override
	public PessoaModel post(PessoaModel model) {
		PessoaModel pessoa = this.consultar(model.getId());
		if (Objects.isNull(pessoa)) {
			lista.add(model);
			return model;
		}
		throw new RuntimeException("Pessoa já existe");
	}

	@Override
	public PessoaModel consultar(Long idPessoa) {
		return lista.stream().filter(item -> idPessoa.equals(item.getId())).findAny().orElse(null);
	}

	@Override
	public List<PessoaModel> mostrarTudo() {
		return lista;
	}

	@Override
	public PessoaModel remover(Long id) {
		PessoaModel pessoaRemover = this.consultar(id);
		if (Objects.nonNull(pessoaRemover)) {
			lista.remove(pessoaRemover);
		}
		return pessoaRemover;
	}
}
>>>>>>> 23116bfd79c2cfef4f1a5c3f459537b71a56c52b
