package Uni4;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        int idadeMarquinhos;
        int idadeZezinho;
        int idadeLuluzinha;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a idade de Marquinhos");
        idadeMarquinhos = sc.nextInt();
        System.out.println("Insira a idade de Luluzinha");
        idadeLuluzinha = sc.nextInt();
        System.out.println("Insira a idade de Zezinho");
        idadeZezinho = sc.nextInt();

        if (idadeLuluzinha < idadeMarquinhos && idadeLuluzinha < idadeZezinho) {
            System.out.println("Luluzinha é a caçula.");

        } else if (idadeMarquinhos < idadeLuluzinha && idadeMarquinhos < idadeZezinho) {
            System.out.println("Marquinhos é o caçula.");

        } else if (idadeZezinho < idadeLuluzinha && idadeZezinho < idadeMarquinhos) {

            System.out.println("Zezinho é o caçula.");
        } else {
            System.out.println("Conflito de idades.");
        }
        sc.close();
    }

}
