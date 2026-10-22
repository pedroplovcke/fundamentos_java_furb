package Uni4;

import java.util.Scanner;

public class Exe26 {
    public static void main(String[] args) {
        char opcao;
        double base, altura, lado, raio, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("T: calcular a área de um triângulo");
        System.out.println("Q: calcular a área de um quadrado");
        System.out.println("R: calcular a área de um retângulo");
        System.out.println("C: calcular a área de um círculo");
        opcao = sc.next().toUpperCase().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.println("Insira a base");
                base = sc.nextDouble();
                System.out.println("Insira a altura");
                altura = sc.nextDouble();
                area = (base * altura) / 2.0;
                System.out.println("Área: " + area);
                break;

            case 'Q':
                System.out.println("Insira o lado");
                lado = sc.nextDouble();
                area = lado * lado;
                System.out.println("Área: " + area);
                break;

            case 'R':
                System.out.println("Insira a base");
                base = sc.nextDouble();
                System.out.println("Insira a altura");
                altura = sc.nextDouble();
                area = base * altura;
                System.out.println("Área: " + area);
                break;

            case 'C':
                System.out.println("Insira o raio");
                raio = sc.nextDouble();
                area = Math.PI * (raio * raio);
                System.out.printf("Área: %.2f\n", area);
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
        sc.close();
    }
}