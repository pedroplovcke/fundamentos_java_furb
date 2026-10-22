package Uni4;

import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 2 valores inteiros.");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("Os valores são múltiplos");

        } else {
            System.out.println("Os valores não são múltiplos");
        }
        sc.close();

    }

}
