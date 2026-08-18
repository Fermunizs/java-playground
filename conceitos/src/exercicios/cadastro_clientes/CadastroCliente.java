package exercicios.cadastro_clientes;

import java.util.Scanner;

// Importa a classe ArrayList para criar listas dinâmicas que mudam de tamanho
import java.util.ArrayList;

//Definir tipo de lista
import java.util.List;

public class CadastroCliente {

    //Classe estática para ser modelo
    static class Cliente{
        String nome;
        String cpf;
        int idade;
        double saldo;

        public Cliente(String nome, String cpf, int idade, double saldo){
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
            this.saldo = saldoInicial;
        }
        //Formata o objeto em string para uma impressão mais bonita
        @Override
        public String toString(){
            return "Nome: " + nome + "\nCPF: " + cpf + "\nIdade: " + idade + "\nSaldo: R$" + String.format("%.2f", saldo);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>(); //""Banco de dados"" temporário na memória
        Cliente clienteLogado = null;

        boolean session = true;

        System.out.println("---BEM-VINDO AO JAVA BANK---");

        while(session){
            if(clienteLogado == null){
                System.out.println("---MENU PRINCIPAL---");
                System.out.println("[1] - Me cadastrar");
                System.out.println("[2] - Fazer Login");
                System.out.println("[3] - Sair");
                System.out.print("Digite o número da opção que deseja seguir: ");

                while(!sc.hasNextInt()){
                    System.out.println("Erro! Você deve digitar uma opção válida!");
                    System.out.println("Digite novamente uma opção válida: ");
                    sc.next(); //Limpa o número incorreto digitado
                }

                int op = sc.nextInt();
                sc.nextLine(); // Limpa o restante da linha

                switch(op){
                    case 1:
                        System.out.println("---NOVO CADASTRO---");
                        System.out.println("Digite o seu nome: ");
                        String nome = sc.nextLine();

                        String cpf = "";
                        while(true){
                            System.out.println("Digite seu cpf(Apenas números): ");
                            cpf = sc.nextLine().replaceAll("\\D", "");

                            if(!cpfValido(cpf)){
                                System.out.println("CPF inválido! Tente novamente!");
                                continue; //Salta para a próxima repetição
                            }

                            boolean cpfExiste = false;
                            for(Cliente c :clientes){
                                if(c.cpf.equals(cpf)){
                                    cpfExiste = true;
                                    break;
                                }
                            }

                            if(cpfExiste){
                                System.out.println("Já existe um cadastro com este cpf! Tente fazer login ou cadastre outro cpf.");
                                continue;
                            }
                            break;
                        }

                        int idade = 0;
                        while(true){
                            try {
                                System.out.println("Digite seu idade: ");
                                idade = Integer.parseInt(sc.nextLine()); //Integer converte string em texto

                                if(idade < 18){
                                    System.out.println("Cadastro recusado. Menores de 18 anos não são aceitos no Java Bank.");
                                    System.out.println("Você pode tentar o cadastro novamente com dados válidos.");
                                    break; // Sai do loop da idade, mas não conclui o cadastro
                                } else if (idade > 121) {
                                    System.out.println("Esta idade é humanamente impossível! Boa tentantiva!");
                                    System.out.println("Você pode tentar o cadastro novamente com dados válidos.");
                                    break;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Digite um número válido para a idade.");
                            }

                            if(idade < 18 && idade > 121){
                                break;
                            }
                        }

                        double saldoInicial = -1;
                        while(saldoInicial < 0){
                            try {
                                System.out.print("Digite o valor do seu primeiro depósito na conta: R$");
                                saldoInicial = Double.parseDouble(sc.nextLine());
                                if(saldoInicial < 0){
                                    System.out.println("O valor inicial não pode ser negativo.");
                                }
                            } catch (NumberFormatException e){
                                System.out.println("⚠️ Digite um valor numérico válido (ex: 1500.50).");
                            }
                        }

                        Cliente novoCliente = new Cliente(nome, cpf, idade, saldoInicial);
                        clientes.add(novoCliente);
                        System.out.println("Cadastro realizado com sucesso! Use seu CPF para fazer Login.");

                        solicitarVoltarOuSair(sc); // Pergunta se quer voltar ao menu ou sair
                        break;
                    case 2:
                        System.out.println("---ÁREA DE LOGIN---");
                        System.out.print("Digite seu CPF cadastrado(Apenas números): ");
                        String cpfLogin = sc.nextLine().replaceAll("\\D","");

                        for(Cliente c : clientes){
                            if(c.cpf.equals(cpfLogin)){
                                clienteLogado = c;
                                break;
                            }
                        }

                        if(clienteLogado != null){
                            System.out.println("🔓 Login efetuado! Bem-vindo(a), " + clienteLogado.nome + ".");
                        } else{
                            System.out.println("CPF não encontrado no sistema. Faça o cadastro primeiro.");
                            solicitarVoltarOuSair(sc);
                        }
                        break;

                    case 3:
                        System.out.println("Obrigado por usar o Java Bank. Até logo!");
                        session = false;
                        break;
                    default:
                        System.out.println(" Opção inválida! Escolha entre");
                }

            } else{
                System.out.println("--- BEM-VINDO " + clienteLogado.nome + " ---");
                System.out.print("[1] - Verificar saldo atual");
                System.out.print("[2] - Realizar depósito");
                System.out.print("[3] - Realizar saque");
                System.out.print("[4] - Sair");
                System.out.println("Selecione a opção que deseja realizar: ");
                int opcao = Integer.parseInt(sc.nextLine());
            }
            while(!sc.hasNextInt){
                System.out.println("Opção inválida! Digite novamente!");
                sc.next();
            }
        }
    }
}

