package Uni4;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        // salario += salarioextra = salario = salario + salarioextra
        // A jornada de trabalho semanal de um funcionário é de 40 horas
        float horasTrabalhadas;
        float valorPorHora;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as horas trabalhadas no mês.");
        horasTrabalhadas = sc.nextFloat();
        System.out.println("Insira o valor pago por hora.");
        valorPorHora = sc.nextFloat();

        float salarioTotal = horasTrabalhadas * valorPorHora;

        if (horasTrabalhadas > 160) {
            float salarioExtra = (horasTrabalhadas - 160) * (valorPorHora / 2);
            salarioTotal = salarioTotal + salarioExtra;

        }
        System.out.printf("O salário total é : %.2f", salarioTotal);
        sc.close();

    }

}
