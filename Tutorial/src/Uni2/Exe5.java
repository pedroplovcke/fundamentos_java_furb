package Uni2;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        int D;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor A:");
        A = sc.nextInt();
        System.out.println("Insira o valor B:");
        B = sc.nextInt();
        System.out.println("Insira o valor C:");
        C = sc.nextInt();
        System.out.println("Insira o valor D:");
        D = sc.nextInt();
        int diferenca = A * B - C * D;
        System.out.println(diferenca);
        sc.close();
    }

}
