package Uni3;

import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        int refri350;
        int refri600;
        int refri2l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de 350ml comprados:");
        refri350 = sc.nextInt();
        System.out.println("Quantidade de 600ml comprados:");
        refri600 = sc.nextInt();
        System.out.println("Quantidade de 2l comprados:");
        refri2l = sc.nextInt();
        float totaldelitros = (refri350 * 0.350f) + (refri600 * 0.600f) + (refri2l * 2);
        System.out.println("O cliente comprou ao total: " + totaldelitros + " litros.");
        sc.close();

    }

}
