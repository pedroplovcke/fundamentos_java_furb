package Uni3;

import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        double distancia;
        double tempo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a distância percorrida(Em Km):");
        distancia = sc.nextDouble();
        System.out.println("Insira o tempo(Em horas):");
        tempo = sc.nextDouble();
        double velocidademedia = distancia / tempo;
        double combustivel = distancia / 12;
        System.out.printf("A velocidade média foi de %.2f km/h e a quantidade de combustível usado foi %.2f litros.",
                velocidademedia, combustivel);
        sc.close();
    }

}
