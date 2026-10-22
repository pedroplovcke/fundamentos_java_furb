package Uni2;

import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        float valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor:");
        valor = sc.nextFloat();
        int nota100 = (int) valor / 100;
        valor = valor % 100;
        int nota50 = (int) valor / 50;
        valor = valor % 50;
        int nota20 = (int) valor / 20;
        valor = valor % 20;
        int nota10 = (int) valor / 10;
        valor = valor % 10;
        int nota5 = (int) valor / 5;
        valor = valor % 5;
        int nota2 = (int) valor / 2;
        valor = valor % 2;

        int moeda1 = (int) valor / 1;
        valor = valor % 1;
        valor = Math.round(valor * 100);
        int moeda50 = (int) valor / 50;
        valor = valor % 50;
        int moeda25 = (int) valor / 25;
        valor = valor % 25;
        int moeda10 = (int) valor / 10;
        valor = valor % 10;
        int moeda5 = (int) valor / 5;
        valor = valor % 5;
        int moeda01 = (int) valor;

        System.out.println("Notas de 100 = " + nota100);
        System.out.println("Notas de 50 = " + nota50);
        System.out.println("Notas de 20 = " + nota20);
        System.out.println("Notas de 10 = " + nota10);
        System.out.println("Notas de 5 = " + nota5);
        System.out.println("Notas de 2 = " + nota2);
        System.out.println("Moedas de 1 = " + moeda1);
        System.out.println("Moedas de 50 centavos = " + moeda50);
        System.out.println("Moedas de 25 centavos = " + moeda25);
        System.out.println("Moedas de 10 centavos = " + moeda10);
        System.out.println("Moedas de 5 centavos = " + moeda5);
        System.out.println("Moedas de 1 centavo = " + moeda01);

        sc.close();
    }

}
