package Uni3;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        double oposto;
        double adjacente;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o cateto oposto:");
        oposto = sc.nextDouble();
        System.out.println("Insira o cateto adjacente:");
        adjacente = sc.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(adjacente, 2) + Math.pow(oposto, 2));
        System.out.printf("A hipotenusa é %.2f.", hipotenusa);
        sc.close();

    }

}
