package Uni3;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        double base;
        double altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a base e a altura:");
        base = sc.nextDouble();
        altura = sc.nextDouble();
        double area = base * altura;
        System.out.println("A área do terreno é: " + area);
        sc.close();

    }

}
