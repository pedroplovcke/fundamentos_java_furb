package Uni4;

import java.util.Scanner;

public class Exe21 {
    public static void main(String[] args) {
        double altura, massa, imc;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a altura (em metros)");
        altura = sc.nextDouble();
        System.out.println("Insira a massa (em kg)");
        massa = sc.nextDouble();

        imc = massa / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Magreza");

        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Saudável");

        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso");

        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");

        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (severa)");

        } else {
            System.out.println("Obesidade Grau III (mórbida)");

        }
        sc.close();
    }
}