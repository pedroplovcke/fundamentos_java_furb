package Uni4;

import java.util.Scanner;

public class Exe22 {
    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o curso (1, 2 ou 3)");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;

            case 2:
                System.out.println("Licenciado em Computação");
                break;

            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
        sc.close();
    }
}