package Uni2;

import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        String nomevendedor;
        double salariofixo;
        double totaldevendas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do vendedor:");
        nomevendedor = sc.next();
        System.out.println("Informe seu salário fixo:");
        salariofixo = sc.nextDouble();
        System.out.println("Informe o total de vendas (em reais):");
        totaldevendas = sc.nextDouble();
        double salariototal = totaldevendas * 0.15 + salariofixo;
        System.out.printf("%s teve o total recebido de R$%.2f", nomevendedor, salariototal);
        sc.close();

    }

}
