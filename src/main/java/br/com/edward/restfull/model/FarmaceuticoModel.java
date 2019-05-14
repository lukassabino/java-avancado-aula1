package br.com.edward.restfull.model;

<<<<<<< HEAD
import br.com.edward.restfull.domain.Farmaceutico;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class FarmaceuticoModel extends PessoaModel {

    private Boolean usaOculos;
    private String crf;
    
    public FarmaceuticoModel(Farmaceutico domain) {
        super(domain);
        this.usaOculos = domain.getUsaOculos();
        this.crf = domain.getCrf();
    }
}
=======
public class FarmaceuticoModel extends PessoaFisicaModel {

	private String crf;

	public FarmaceuticoModel() {
		super();
	}

	public FarmaceuticoModel(String nome) {
		super(nome);
	}

	public String getCrf() {
		return crf;
	}
}
>>>>>>> 23116bfd79c2cfef4f1a5c3f459537b71a56c52b
