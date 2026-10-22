package Uni2;

import java.util.Scanner;

public class Exe19 {
    public static void main(String[] args) {

        int b;
        int c;
        int d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de B:");
        b = sc.nextInt();
        System.out.println("Insira o valor de C:");
        c = sc.nextInt();
        System.out.println("Insira o valor de D:");
        d = sc.nextInt();
        int a = b;
        if (c != d) {
            System.out.println("C e D devem ser iguais");
            System.exit(0);

        }
        System.out.println("O valor de A é " + a);
        sc.close();

    }

}
