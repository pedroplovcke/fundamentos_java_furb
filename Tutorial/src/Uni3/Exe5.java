package Uni3;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {

        int frangos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o total de frangos:");
        frangos = sc.nextInt();
        float custoanel = (frangos * 4) + (frangos * 7);
        System.out.println("O gasto total para marcar " + frangos + " é R$" + custoanel + ".");
        sc.close();

    }

}
