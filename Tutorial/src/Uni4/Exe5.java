package Uni4;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        boolean resposta;
        Scanner sc = new Scanner(System.in);

        System.out.println("A cor é azul?");
        resposta = sc.nextBoolean();

        if (resposta) {
            System.out.println("Sim.");

        } else {
            System.out.println("Não.");
        }
        sc.close();

    }

}
