package Uni4;

import java.util.Scanner;

public class Exe24 {
    public static void main(String[] args) {
        int v1, v2, v3, opcao;
        int menor, meio, maior;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor 1");
        v1 = sc.nextInt();
        System.out.println("Insira o valor 2");
        v2 = sc.nextInt();
        System.out.println("Insira o valor 3");
        v3 = sc.nextInt();

        System.out.println("Insira a opção (1, 2 ou 3)");
        opcao = sc.nextInt();

        // Descobre menor, meio e maior
        if (v1 <= v2 && v1 <= v3) {
            menor = v1;
            if (v2 <= v3) {
                meio = v2;
                maior = v3;
            } else {
                meio = v3;
                maior = v2;
            }
        } else if (v2 <= v1 && v2 <= v3) {
            menor = v2;
            if (v1 <= v3) {
                meio = v1;
                maior = v3;
            } else {
                meio = v3;
                maior = v1;
            }
        } else {
            menor = v3;
            if (v1 <= v2) {
                meio = v1;
                maior = v2;
            } else {
                meio = v2;
                maior = v1;
            }
        }

        switch (opcao) {
            case 1:
                System.out.println(menor + " " + meio + " " + maior);
                break;

            case 2:
                System.out.println(maior + " " + meio + " " + menor);
                break;

            case 3:
                System.out.println(meio + " " + maior + " " + menor);
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
        sc.close();
    }
}