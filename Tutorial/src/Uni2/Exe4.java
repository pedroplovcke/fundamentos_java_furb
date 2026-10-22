package Uni2;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a nota1:");
        nota1 = sc.nextFloat();
        System.out.println("Insira a nota2:");
        nota2 = sc.nextFloat();
        float media = ((nota1 * 3.5f) + (nota2 * 7.5f)) / 11;
        System.out.printf("A média é: %.2f", media);
        sc.close();
    }

}
