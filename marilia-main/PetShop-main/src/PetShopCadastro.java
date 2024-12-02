// Importação das classes necessárias
import CadastroAnimal.Animal;
import CadastroAnimal.Servico;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
// Classe principal responsável por cadastrar um animal e associar um serviço a ele
public class PetShopCadastro {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner scanner = new Scanner(System.in);

        // Cadastro do animal
        String nome;
        String telefone;
        String endereco;  // Variável para armazenar o endereço
        String tipo_animal;
        String raca_animal;
        double altura;
        double peso;
        int idade_animal;

        // Coleta de dados do animal
        System.out.print("Digite o nome do animal: ");
        nome = scanner.next();
        
        System.out.print("Digite o Telefone do responsável: ");
        telefone = scanner.next();
        
        System.out.print("Digite o Endereço do responsável: ");
        scanner.nextLine();  // Consumir a linha extra
        endereco = scanner.nextLine(); // Agora, lê a linha inteira para o endereço
        
        System.out.print("Digite o Tipo do Animal: ");
        tipo_animal = scanner.next();
        
        System.out.print("Digite a Raça do Animal: ");
        raca_animal = scanner.next();
        
        System.out.print("Digite a altura do Animal: ");
        altura = scanner.nextDouble();

        System.out.print("Digite o peso do Animal: ");
        peso = scanner.nextDouble();

        System.out.print("Digite a Idade do Animal: ");
        idade_animal = scanner.nextInt();
        
 // A data de cadastro do animal é a data atual
        LocalDate dataCadastro = LocalDate.now();

        // Criação do objeto 'Animal'
        Animal animal = new Animal(1, dataCadastro, nome, telefone, endereco, tipo_animal, raca_animal, altura, peso, idade_animal, new ArrayList<>());

        // Cadastro do serviço
          // Pergunta ao usuário qual tipo de serviço deseja realizar para o animal
        int escolhaServico;
        System.out.println("Escolha o tipo de serviço para o animal: ");
        System.out.println("1 - Banho");
        System.out.println("2 - Tosa");
        escolhaServico = scanner.nextInt();
        scanner.nextLine();  // Consumir a linha extra do buffer

        String tipoServico;
        switch (escolhaServico) {
            case 1:
                tipoServico = "banho";
                break;
            case 2:
                tipoServico = "tosa";
                break;
            default:
                System.out.println("Opção de serviço inválida!");
                scanner.close();
                return;
        }

        LocalDate dataServico = LocalDate.now();
        
        // Criação de um objeto 'Servico' com base no tipo de serviço escolhido e os dados do cadastro
        Servico servico = new Servico(tipoServico, dataServico, 1, dataCadastro, nome, telefone, endereco);

        // Configurações do serviço
        servico.setTipoServico(escolhaServico == 1 ? "Banho" : "Tosa");
        servico.setDataServico(LocalDate.now());
        servico.setNome("Serviço para " + animal.getNome());
        servico.setTelefone(animal.getTelefone());

        // Associar o serviço ao animal
        animal.adicionarServico(servico);

        // Imprimir os cadastros
        System.out.println("\nCadastro do Animal:");
        animal.imprimirCadastro();
// Fecha o scanner após a execução do programa
        scanner.close();
    }
}
