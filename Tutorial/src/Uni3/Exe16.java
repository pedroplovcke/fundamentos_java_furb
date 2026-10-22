package Uni3;

import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        int valorcompra;
        int valorpago;
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor total da compra:");
        valorcompra = sc.nextInt();
        System.out.println("Valor dado pelo cliente:");
        valorpago = sc.nextInt();
        // Vou criar várias variáveis para me organizar melhor mentalmente
        int troco = (valorpago - valorcompra);
        int notade100 = troco / 100;
        int notade10 = (troco - (notade100 * 100)) / 10;
        int notade1 = troco % 10;
        int minimodenotas = notade100 + notade10 + notade1;
        System.out.println("O número mínimo de notas de troco é: " + minimodenotas + ".");
        System.out.println("Quantidade de notas de 100 necessárias é: " + notade100 + ".");
        System.out.println("Quantidades de notas de 10 necessárias é: " + notade10 + ".");
        System.out.println("Quantidades de nota de 1 necessárias é: " + notade1 + ".");
        sc.close();

    }

}
