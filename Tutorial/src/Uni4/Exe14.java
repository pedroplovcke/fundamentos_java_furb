package Uni4;

import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        int dia, mes, ano;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia da sua data");
        dia = sc.nextInt();
        System.out.println("Digite o mês da sua data");
        mes = sc.nextInt();
        System.out.println("Digite o ano da sua data");
        ano = sc.nextInt();

        if (verificaData(dia, mes, ano) == true) {
            System.out.println("Dia:" + dia + " Mês:" + mes + " Ano:" + ano);
            System.out.println("Data válida");

        } else {
            System.out.println("Data inválida");

        }
        sc.close();

    }

    public static boolean verificaData(int dia, int mes, int ano) {
        int maxDias;
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;

        if (mes < 1 || mes > 12) {
            return false;
        }
        /*
         * 31 dias: janeiro, março, maio, julho, agosto, outubro, dezembro
         * 30 dias: abril, junho, setembro, novembro
         */

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            maxDias = 31;

        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            maxDias = 30;

        } else if (mes == 2 && bissexto) {
            maxDias = 29;

        } else {
            maxDias = 28;

        }
        return dia >= 1 && dia <= maxDias;

    }

}
