package Uni2;

import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        float codigo1;
        float numerodepecas1;
        float valorunitario1;
        float codigo2;
        float numerodepecas2;
        float valorunitario2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o código da peça 1:");
        codigo1 = sc.nextFloat();
        System.out.println("Insira o valor da peça 1:");
        valorunitario1 = sc.nextFloat();
        System.out.println("Insira o número de unidades da peça 1:");
        numerodepecas1 = sc.nextFloat();
        System.out.println("Insira o valor da peça 1:");
        System.out.println("Insira o código da peça 2:");
        codigo2 = sc.nextFloat();
        System.out.println("Insira o valor da peça 2:");
        valorunitario2 = sc.nextFloat();
        System.out.println("Insira o número de unidades da peça 2:");
        numerodepecas2 = sc.nextFloat();
        float valortotal = valorunitario1 * numerodepecas1 + valorunitario2 * numerodepecas2;
        System.out.println("Código da peça 1: " + codigo1);
        System.out.println("Código da peça 2: " + codigo2);
        System.out.printf("O valor a ser pago é R$%.2f", valortotal);

        sc.close();

    }

}
