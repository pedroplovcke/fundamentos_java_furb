package Uni3;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        double celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a temperatura em °C:");
        celsius = sc.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("%.2f°F.", fahrenheit);
        sc.close();

    }

}
