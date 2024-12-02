package CadastroAnimal;

import java.time.LocalDate;

public class Servico extends Cadastro {
    private String tipoServico;
    private LocalDate dataServico;


	public Servico(String tipoServico, LocalDate dataServico, int id, LocalDate dataCadastro, String nome, String telefone, String endereco) {
		super(id, dataCadastro, nome, telefone, endereco);
		this.tipoServico = tipoServico;
		this.dataServico = dataServico;
	}
	

    // GETTERS E SETTERS 

	public String getTipoServico() {
		return this.tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}

	public LocalDate getDataServico() {
		return this.dataServico;
	}

	public void setDataServico(LocalDate dataServico) {
		this.dataServico = dataServico;
	}

	public void realizarServico(){

	}

    //public void realizarServico(){
    //    System.out.println("Serviço de " + getTipoServico() + "realizado com sucesso!");
   // }

    @Override
    public void imprimirCadastro() {
		System.out.println("Cadastro do Serviço: ");
        System.out.println("Tipo de Serviço: " + getTipoServico());
        System.out.println("Data do Serviço: " + getDataServico());

    }
}
