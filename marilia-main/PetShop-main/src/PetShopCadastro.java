import CadastroAnimal.Animal;
import CadastroAnimal.Servico;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PetShopCadastro {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner scanner = new Scanner(System.in);

        // Cadastro do animal
        String nome;
        String telefone;
        String endereco;
        String tipo_animal;
        String raca_animal;
        double altura;
        double peso;
        int idade_animal;

        
        System.out.print("Digite o nome do animal: ");
        nome = scanner.next();
        // animal.setNome(scanner.next());
        System.out.print("Digite o Telefone do responsável: ");
        telefone = scanner.next();
        // animal.setTelefone(scanner.next());
        System.out.print("Digite o Endereço do responsável: ");
        endereco = scanner.next();
        // animal.setEndereco(scanner.next());
        System.out.print("Digite o Tipo do Animal: ");
        tipo_animal = scanner.next();
        // animal.setTipo(scanner.next());
        System.out.print("Digite a Raça do Animal: ");
        raca_animal = scanner.next();
        // animal.setRaca(scanner.next());
        System.out.print("Digite a altura do Animal: ");
        altura = scanner.nextDouble();

        System.out.print("Digite o peso do Animal: ");
        peso = scanner.nextDouble();

        System.out.print("Digite a Idade do Animal: ");
        idade_animal = scanner.nextInt();

        LocalDate dataCadastro = LocalDate.now();

        // animal.setIdade(scanner.nextInt());
        Animal animal = new Animal(1, dataCadastro, nome, telefone, endereco, tipo_animal, raca_animal, altura, peso, idade_animal, new ArrayList<>());

        // animal.setDataCadastro(LocalDate.now());


        // Cadastro do serviço
        int escolhaServico;
        System.out.println("Escolha o tipo de serviço para o animal: ");
        System.out.println("1 - Banho");
        System.out.println("2 - Tosa");
        escolhaServico = scanner.nextInt();
        scanner.nextLine();  // Consumir a linha extra do buffer

        String tipoServico;
        // Servico servico = new Servico();
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

        Servico servico = new Servico(tipoServico, dataServico, 1, dataCadastro, nome, telefone, endereco);

        // Removido o pedido de descrição do serviço

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

        scanner.close();
    }
}