package Uni4;

import java.util.Scanner;

public class Exe27 {
    public static void main(String[] args) {
        int horaChegada, minChegada, horaSaida, minSaida;
        int totalMinutosChegada, totalMinutosSaida, diferencaMinutos;
        int horasCobrada, minutosRestantes;
        double valorTotal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a hora de chegada");
        horaChegada = sc.nextInt();
        System.out.println("Insira os minutos de chegada");
        minChegada = sc.nextInt();
        System.out.println("Insira a hora de saída");
        horaSaida = sc.nextInt();
        System.out.println("Insira os minutos de saída");
        minSaida = sc.nextInt();

        // Validação básica dos horários informados
        if (horaChegada < 0 || horaChegada > 23 || minChegada < 0 || minChegada > 59
                || horaSaida < 0 || horaSaida > 23 || minSaida < 0 || minSaida > 59) {
            System.out.println("Horário inválido!");
            sc.close();
            return;
        }

        totalMinutosChegada = (horaChegada * 60) + minChegada;
        totalMinutosSaida = (horaSaida * 60) + minSaida;

        if (totalMinutosSaida < totalMinutosChegada) {
            System.out.println("A saída deve ser após a chegada no mesmo dia!");
            sc.close();
            return;
        }

        diferencaMinutos = totalMinutosSaida - totalMinutosChegada;

        // Cálculo de horas inteiras e arredondamento por minutos
        horasCobrada = diferencaMinutos / 60;
        minutosRestantes = diferencaMinutos % 60;

        if (horasCobrada == 0) {
            horasCobrada = 1; // Menos de 1 hora inteira paga no mínimo 1 hora
        } else if (minutosRestantes >= 30) {
            horasCobrada++;
        }

        // Cálculo da tarifa
        if (horasCobrada <= 2) {
            valorTotal = horasCobrada * 5.0;

        } else if (horasCobrada <= 4) {
            valorTotal = (2 * 5.0) + ((horasCobrada - 2) * 7.50);

        } else {
            valorTotal = (2 * 5.0) + (2 * 7.50) + ((horasCobrada - 4) * 10.0);

        }

        System.out.printf("Preço cobrado = R$%.2f\n", valorTotal);

        sc.close();
    }
}