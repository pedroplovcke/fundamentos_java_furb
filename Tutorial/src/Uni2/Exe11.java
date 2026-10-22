package Uni2;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Insira o valor A:");
        a = sc.nextDouble();
        System.out.println("Insira o valor B:");
        b = sc.nextDouble();
        System.out.println("Insira o valor C:");
        c = sc.nextDouble();
        double areatriangulo = (a * c) / 2;
        double areacirculo = 3.14159 * Math.pow(c, 2);
        double areatrapezio = ((a + b) * c) / 2;
        double areaquadrado = b * b;
        double arearetangulo = a * b;
        System.out.printf("A área do triângulo é: %.2f %n", areatriangulo);
        System.out.printf("A área do círculo é: %.2f %n", areacirculo);
        System.out.printf("A área do trapézio é: %.2f %n", areatrapezio);
        System.out.printf("A área do quadrado é: %.2f %n", areaquadrado);
        System.out.printf("A área do retângulo é: %.2f %n", arearetangulo);
        sc.close();

    }

}
