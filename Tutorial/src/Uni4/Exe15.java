package Uni4;

import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        int mesesNaEmpresa;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira quantos meses está na empresa");
        mesesNaEmpresa = sc.nextInt();

        if (mesesNaEmpresa >= 1 && mesesNaEmpresa <= 12) {
            System.out.println("O funcionário irá receber 5% de reajuste");

        } else if (mesesNaEmpresa >= 13 && mesesNaEmpresa <= 48) {
            System.out.println("O funcionário irá receber 7% de reajuste");

        } else {
            System.out.println("Ajuste não informado");
        }
        sc.close();

    }

}
