package Uni3;

import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        double raio;
        double altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o raio da lata de óleo:");
        raio = sc.nextDouble();
        System.out.println("Insira a altura da lata de óleo:");
        altura = sc.nextDouble();
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.printf("O volume da lata de óleo é: %.2f.", volume);
        sc.close();

    }

}
