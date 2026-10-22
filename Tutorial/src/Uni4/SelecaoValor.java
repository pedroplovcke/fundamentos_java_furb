package Uni4;

import java.util.Scanner;

public class SelecaoValor {
    public static void main(String[] args) {
        char tempo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sol-S");
        System.out.println("Chuva-C");
        System.out.println("Nublado-N");
        System.out.println("Granizo-G");
        System.out.println("Furacão-F");

        System.out.println("Escolha uma das opções de acordo com o tempo.");
        tempo = Character.toUpperCase(sc.next().charAt(0));
        // poderia ser tb = tempo = Character.toUpperCase()sc.next().charAt(0);

        switch (tempo) {
            case 'S':
                System.out.println("O dia está ensolarado.");

                break;
            case 'C':
                System.out.println("O dia está chuvoso.");
                break;
            case 'N':
                System.out.println("O dia está nublado.");
                break;
            case 'G':
                System.out.println("Cuidado, está tendo granizo.");
                break;
            case 'F':
                System.out.println("CUIDADO, ALERTA DE FURACÃO.");

            default:
                System.out.println("Opção inválida.");
                break;
        }
        sc.close();

    }

}
