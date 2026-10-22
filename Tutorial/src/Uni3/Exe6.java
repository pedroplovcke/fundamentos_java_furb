package Uni3;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {

        float pesoprato;
        Scanner sc = new Scanner(System.in);
        System.out.println("Peso em KGs:");
        pesoprato = sc.nextFloat();
        float valorprato = (pesoprato - 0.750f) * 25;
        System.out.println("O valor do prato do cliente é R$" + valorprato + ".");
        sc.close();

    }

}
