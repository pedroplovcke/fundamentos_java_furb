package Uni4;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        int lado1, lado2, lado3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o lado 1");
        lado1 = sc.nextInt();
        System.out.println("Insira o lado 2");
        lado2 = sc.nextInt();
        System.out.println("Insira o lado 3");
        lado3 = sc.nextInt();
        if (naoFormaTriangulo(lado1, lado2, lado3)) {
            System.out.println("Não formam um triângulo");
        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo equilátero");

        } else if (trianguloIsosceles(lado1, lado2, lado3)) {
            System.out.println("Triângulo isósceles");

        } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
            System.out.println("Triângulo escaleno");

        }

        else {
            System.out.println("Não formam um triangulo");
        }
        sc.close();
    }

    public static boolean trianguloIsosceles(int lado1, int lado2, int lado3) {
        if (lado1 == lado2 && lado2 != lado3 || lado1 == lado3 && lado1 != lado2 || lado2 == lado3 && lado2 != lado1) {
            return true;

        } else {
            return false;
        }

    }

    public static boolean naoFormaTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            return true;

        } else {
            return false;
        }
    }

}
