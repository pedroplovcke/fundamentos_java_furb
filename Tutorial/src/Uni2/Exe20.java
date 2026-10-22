package Uni2;

import java.util.Scanner;

public class Exe20 {
    public static void main(String[] args) {
        int quantidadedobras;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vezes dobradas:");
        quantidadedobras = sc.nextInt();
        if (quantidadedobras % 2 != 0) {
            System.out.println("Apenas números pares");
            System.exit(0);

        }
        int quadrados = Math.powExact(4, quantidadedobras / 2);
        System.out.println("Quantidades de quadrados na folha: " + quadrados);
        sc.close();

    }

}
