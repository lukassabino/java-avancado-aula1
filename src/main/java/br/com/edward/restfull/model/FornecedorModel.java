package br.com.edward.restfull.model;

import br.com.edward.restfull.domain.Fornecedor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class FornecedorModel extends PessoaModel {

<<<<<<< HEAD
    private String razaoSocial;
    private String representacao;
    
    public FornecedorModel(Fornecedor domain) {
        super(domain);
        this.razaoSocial = domain.getRazaoSocial();
        this.representacao = domain.getRepresentacao();
    }
}
=======
	public FornecedorModel() {
		super();
	}

	public FornecedorModel(String nome) {
		super(nome);
	}

	public String getRepresentacao() {
		return representacao;
	}
}
>>>>>>> 23116bfd79c2cfef4f1a5c3f459537b71a56c52b
