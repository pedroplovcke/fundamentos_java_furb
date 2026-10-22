package Uni2;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        double raio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o raio:");
        raio = sc.nextDouble();
        // double circunferencia = Math.PI * Math.pow(raio, 2);
        double circunferencia = 3.14159 * Math.pow(raio, 2);
        System.out.println(circunferencia);
        sc.close();

    }

}
