package CadastroAnimal;

import java.time.LocalDate;

//Classe MÃE
// Classe abstrata que serve como classe base (mãe) para outras classes como 'Animal' e 'Servico'
public abstract class Cadastro {
	// Atributos da classe Cadastro
    private int id;
    private LocalDate dataCadastro;
    private String nome;
    private String telefone;
    private String endereco;

// Construtor da classe Cadastro, inicializa os atributos com os valores fornecidos
	public Cadastro(int id, LocalDate dataCadastro, String nome, String telefone, String endereco) {
		this.id = id;
		this.dataCadastro = dataCadastro;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}


    // GETTERS E SETTERS

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDataCadastro() {
		return this.dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
    public abstract void imprimirCadastro();
}
