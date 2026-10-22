package Uni2;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        double distanciacatch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a distância(em km):");
        distanciacatch = sc.nextDouble();
        double distanciatomada = (distanciacatch * 60) / 30;
        System.out.printf("O tempo é %.0f minutos", distanciatomada);
        sc.close();

    }

}
