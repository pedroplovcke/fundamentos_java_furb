package Uni4;

import java.util.Scanner;

public class Exe19 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de X");
        x = sc.nextInt();
        System.out.println("Insira o valor de Y");
        y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");

        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");

        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 2");

        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");

        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante 4");

        }
        sc.close();
    }
}