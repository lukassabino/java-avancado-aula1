package br.com.edward.restfull.model;

<<<<<<< HEAD
import br.com.edward.restfull.domain.Pessoa;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PessoaModel {

    private Long id;
    private String nome;
    private Integer idade;
    private String nacionalidade;
    private String documento;

    public PessoaModel(Pessoa domain) {
        this.id = domain.getId();
        this.nome = domain.getNome();
        this.idade = domain.getIdade();
        this.nacionalidade = domain.getNacionalidade();
        this.documento = domain.getDocumento();
    }
}
=======
import java.time.ZonedDateTime;

public abstract class PessoaModel {

	private static Long cont = 0L;

	private final Long id;
	private ZonedDateTime dataCriacao;
	private String nome;
	private Integer idade;
	private String nacionalidade;
	private String documento;

	public PessoaModel() {
		this.id = ++cont;
		this.dataCriacao = ZonedDateTime.now();
	}

	public PessoaModel(String nome) {
		this();
		this.nome = nome;
	}

	public abstract Boolean getDocumentoValido();

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public ZonedDateTime getDataCriacao() {
		return dataCriacao;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public String getDocumento() {
		return documento;
	}
}
>>>>>>> 23116bfd79c2cfef4f1a5c3f459537b71a56c52b
