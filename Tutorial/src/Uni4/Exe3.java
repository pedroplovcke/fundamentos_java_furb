package Uni4;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva 2 números inteiros.");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        if (valor1 == valor2) {
            System.out.println("Os dois valores são iguais.");

        } else if (valor1 > valor2) {
            System.out.printf("O valor %d é maior do que o valor %d.", valor1, valor2);

        } else {
            System.out.printf("O valor %d é maior do que o valor %d.", valor2, valor1);
        }
        sc.close();

    }

}
