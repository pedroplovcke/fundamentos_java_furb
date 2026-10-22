package Uni3;

import java.util.Scanner;

public class Exe16ComCentavos {
    public static void main(String[] args) {
        // Mesma coisa do exe16 porém com notas reais e centavos também.
        double valorcompra;
        double valorpago;
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor total da compra:");
        valorcompra = sc.nextDouble();
        System.out.println("Valor dado pelo cliente:");
        valorpago = sc.nextDouble();
        double troco = valorpago - valorcompra;
        int notade200 = (int) troco / 200;
        int notade100 = ((int) troco % 200) / 100;
        int notade50 = (((int) troco % 200) % 100) / 50;
        int notade20 = ((((int) troco % 200) % 100) % 50) / 20;
        int notade10 = (((((int) troco % 200) % 100) % 50) % 20) / 10;
        int notade5 = ((((((int) troco % 200) % 100) % 50) % 20) % 10) / 5;
        int notade2 = (((((((int) troco % 200) % 100) % 50) % 20) % 10) % 5) / 2;
        int moedade1real = ((((((((int) troco % 200) % 100) % 50) % 20) % 10) % 5) % 2);
        double centavos = troco - (int) troco;
        double quantidadecentavos = centavos * 100;
        int moedade50cents = (int) quantidadecentavos / 50;
        int moedade25cents = ((int) quantidadecentavos % 50) / 25;
        int moedade10cents = (((int) quantidadecentavos % 50) % 25) / 10;
        int moedade5cents = ((((int) quantidadecentavos % 50) % 25) % 10) / 5;
        int moedade1cents = ((((int) quantidadecentavos % 50) % 25) % 10) % 5;
        int minimodenotas = notade200 + notade100 + notade50 + notade20 + notade10 + notade5 +
                notade2;
        int minimodemoedas = moedade1real + moedade50cents + moedade25cents + moedade10cents + moedade5cents
                + moedade1cents;
        System.out.printf("O troco é de %.2f. ", troco);
        System.out.println("O número mínimo de notas de troco é " + minimodenotas + ".");
        System.out.println("O número mínimo de moedas de troco é " + minimodemoedas + ".");
        System.out.println("Quantidade de notas de 200 necessárias é: " + notade200 + ".");
        System.out.println("Quantidade de notas de 100 necessárias é: " + notade100 + ".");
        System.out.println("Quantidade de notas de 50 necessárias é: " + notade50 + ".");
        System.out.println("Quantidade de notas de 20 necessárias é: " + notade20 + ".");
        System.out.println("Quantidades de notas de 10 necessárias é: " + notade10 + ".");
        System.out.println("Quantidade de notas de 2 necessárias é: " + notade2 + ".");
        System.out.println("Quantidades de moedas de 1 necessárias é: " + moedade1real + ".");
        System.out.println("Quantidades de moedas de 50 centavos necessárias é: " + moedade50cents + ".");
        System.out.println("Quantidades de moedas de 25 centavos necessárias é: " + moedade25cents + ".");
        System.out.println("Quantidades de moedas de 10 centavos necessárias é: " + moedade10cents + ".");
        System.out.println("Quantidades de moedas de 5 centavos necessárias é: " + moedade5cents + ".");
        System.out.println("Quantidades de moedas de 1 centavo necessárias é: " + moedade1cents + ".");
        sc.close();

    }

}
