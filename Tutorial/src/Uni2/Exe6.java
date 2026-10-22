package Uni2;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        float idfuncionario;
        float hrstrabalhadas;
        float valorhora;
        float diasuteis;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a id do funcionário:");
        idfuncionario = sc.nextFloat();
        System.out.println("Insira horas trabalhadas:");
        hrstrabalhadas = sc.nextFloat();
        System.out.println("Insira o valor que recebe por hora:");
        valorhora = sc.nextFloat();
        System.out.println("Insira quantos dias úteis tem no mês:");
        diasuteis = sc.nextFloat();
        float salario = (hrstrabalhadas * valorhora) * diasuteis;
        System.out.printf("O funcionário %.0f, recebe R$%.2f", idfuncionario, salario);
        sc.close();

    }

}
