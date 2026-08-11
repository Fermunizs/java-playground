package fundamentos;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CALCULADORA ---");

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

//PRIMEIRA LINHA DO MATH
        int s = n1 + n2;
        System.out.print("O resultado da soma eh: " + s);

        sc.close();
    }
}