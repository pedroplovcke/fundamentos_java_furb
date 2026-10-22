package Uni4;

import java.util.Scanner;

public class Exe25 {
    public static void main(String[] args) {
        double v1, v2;
        int opcao;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor 1");
        v1 = sc.nextDouble();
        System.out.println("Insira o valor 2");
        v2 = sc.nextDouble();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(v1 + v2);
                break;

            case 2:
                System.out.println(v1 - v2);
                break;

            case 3:
                System.out.println(v1 * v2);
                break;

            case 4:
                if (v2 != 0) {
                    System.out.println(v1 / v2);
                } else {
                    System.out.println("Erro: divisão por zero não permitida");
                }
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
        sc.close();
    }
}