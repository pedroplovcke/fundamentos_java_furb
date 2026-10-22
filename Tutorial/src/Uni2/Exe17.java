package Uni2;

import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {

        double horastrabalhadas;
        double dependentes;
        String nome;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do funcionário:");
        nome = sc.next();
        System.out.println("Quantidade de horas trabalhadas no mês:");
        horastrabalhadas = sc.nextDouble();
        System.out.println("Número de dependentes:");
        dependentes = sc.nextDouble();
        double salariobruto = (horastrabalhadas * 10) + (dependentes * 60);
        double salariotrabalho = (horastrabalhadas * 10);
        double inss = salariotrabalho * 0.085;
        double imposto = salariotrabalho * 0.05;
        double salarioliquido = salariobruto - (imposto + inss);
        System.out.printf("O funcionário %s possui um salário bruto de R$%.2f e um salário liquído de R$%.2f.", nome,
                salariobruto, salarioliquido);
        sc.close();
    }

}
