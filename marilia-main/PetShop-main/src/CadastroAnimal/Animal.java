package CadastroAnimal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// A classe 'Animal' herda da classe 'Cadastro', representando um animal cadastrado.
public class Animal extends Cadastro{
    private String tipo;
    private String raca;
    private double altura;
    private double peso;
    private int idade;
	private final List<Servico> servicos; // Lista de serviços realizados no animal cadastrado.
    

	// Construtor da classe Animal, inicializando todos os atributos do animal, incluindo a lista de serviços
	public Animal(int id, LocalDate dataCadastro, String nome, String telefone, String endereco, String tipo, String raca, double altura, double peso, int idade, List<Servico> servicos) {
		super(id, dataCadastro, nome, telefone, endereco);
		//ATRIBUIÇÕES
		this.tipo = tipo;
		this.raca = raca;
		this.altura = altura;
		this.peso = peso;
		this.idade = idade;
		this.servicos = new ArrayList<>(); // Inicializa a lista de serviços, um ArrayList
	}
	
	//GETTERS E SETTERS

	public String getTipo() {
		return this.tipo; //Define
	}

	public void setTipo(String tipo) {
		this.tipo = tipo; //Retorna
	}

	public String getRaca() {
		return this.raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<Servico> getServicos() {
        return servicos;
    }

    public void adicionarServico(Servico servico) {
        this.servicos.add(servico);
    }

    @Override
    public void imprimirCadastro(){
 	// Imprime as informações básicas do animal
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Raça: " + getRaca());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Serviços realizados:");
	// Percorre a lista de serviços e imprime cada um
        for (Servico servico : servicos) {
            servico.imprimirCadastro();
        }

    }

}
