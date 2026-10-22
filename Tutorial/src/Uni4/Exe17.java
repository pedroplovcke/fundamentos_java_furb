package Uni4;

import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        double rendaAnual, rendaLiquida, imposto;
        int dependentes;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a renda anual");
        rendaAnual = sc.nextDouble();
        System.out.println("Insira a quantidade de dependentes");
        dependentes = sc.nextInt();

        rendaLiquida = rendaAnual - (rendaAnual * (dependentes * 0.02));

        if (rendaLiquida <= 2000.0) {
            System.out.println("Não paga imposto");

        } else if (rendaLiquida > 2000.0 && rendaLiquida <= 5000.0) {
            imposto = rendaLiquida * 0.05;
            System.out.println("O imposto é de 5%: R$ " + imposto);

        } else if (rendaLiquida > 5000.0 && rendaLiquida <= 10000.0) {
            imposto = rendaLiquida * 0.10;
            System.out.println("O imposto é de 10%: R$ " + imposto);

        } else {
            imposto = rendaLiquida * 0.15;
            System.out.println("O imposto é de 15%: R$ " + imposto);

        }
        sc.close();
    }
}