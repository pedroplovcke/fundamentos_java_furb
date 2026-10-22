package Uni2;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois valores inteiros:");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        int resultado = valor1 * valor2;
        System.out.println(resultado);
        sc.close();
    }

}
