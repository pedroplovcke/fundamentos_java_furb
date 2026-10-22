package Uni2;

import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        int refri350;
        int refri600;
        int refri2L;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de refris 350 comprados:");
        refri350 = sc.nextInt();
        System.out.println("Quantidade de refris 600 comprados:");
        refri600 = sc.nextInt();
        System.out.println("Quantidade de refris 2 litros comprados:");
        refri2L = sc.nextInt();
        float litrostotais = refri350 * 0.350f + refri600 * 0.600f + refri2L * 2;
        System.out.printf("Foi comprado o total de %.3f litros", litrostotais);
        sc.close();

    }

}
