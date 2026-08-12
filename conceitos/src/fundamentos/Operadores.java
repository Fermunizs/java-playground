package fundamentos;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Operadores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CALCULADORA ---");

        int n1 = 0;
        while(true){
            try {
                System.out.print("Digite o primeiro número: ");
                n1 = sc.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Erro: Você deve digitar um número inteiro válido!");
                sc.next();
            }
        }

        int n2 = 0;
        while(true){
           try {
               System.out.print("Digite o segundo número: ");
               n2 = sc.nextInt();
               break;
           }catch (InputMismatchException e) {
               System.out.println("Erro: Você deve digitar um número inteiro válido!");
               sc.next();
           }
        }


//PRIMEIRA LINHA DO MATH MEU AMOR
//        int s = n1 + n2;
//        System.out.print("O resultado da soma eh: " + s);
        System.out.println("Escolha a operação: ");
        System.out.println("[+] Adição");
        System.out.println("[-] Subtração");
        System.out.println("[*] Multiplicacao]");
        System.out.println("[/] Divisão");
        System.out.println("Selecione o símbolo da operação");
        char op = sc.next().charAt(0);

        System.out.print("O resultado da operação é: ");
        switch (op){
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                if (n2 != 0) {
                    System.out.println((double) n1 / n2);
                }else{
                    System.out.println("Erro! Não é possível dividir por 0");
                }
                break;
            default:
                System.out.println("Operação Inválida!");
                break;
        }
        sc.close();
    }
}