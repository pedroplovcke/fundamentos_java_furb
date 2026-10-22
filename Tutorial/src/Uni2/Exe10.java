package Uni2;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        int segundos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira quantos segundos durou o evento:");
        segundos = sc.nextInt();

        int minutos = segundos / 60;
        int horas = minutos / 60;
        int minutosreais = minutos - (horas * 60);
        if (minutos % 60 == 0) {
            minutosreais = 0;

        }
        int segundosreais = segundos - (minutos * 60);
        if (segundos % 60 == 0) {
            segundosreais = 0;

        }

        System.out.printf("Horas:%d Minutos:%d Segundos:%d", horas, minutosreais, segundosreais);
        sc.close();
    }

}
