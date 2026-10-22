package Uni4;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        float numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor.");
        numero = sc.nextFloat();

        if (numero % 1 == 0) {
            System.out.println("Casas decimais não foram digitadas.");

        } else {
            System.out.println("Casas decimais foram digitadas.");
        }
        sc.close();

    }

}
