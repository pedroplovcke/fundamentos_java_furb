package Uni3;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float nota3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua nota 1:");
        nota1 = sc.nextFloat();
        System.out.println("Insira sua nota 2:");
        nota2 = sc.nextFloat();
        System.out.println("Insira sua nota 3:");
        nota3 = sc.nextFloat();
        float mediaponderada = (nota1 * 0.5f) + (nota2 * 0.3f) + (nota3 * 0.2f);
        System.out.printf("Sua média é: %.2f.", mediaponderada);
        sc.close();
    }

}
