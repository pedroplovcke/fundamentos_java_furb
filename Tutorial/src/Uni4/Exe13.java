package Uni4;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        int carta1, carta2, carta3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a carta 1");
        carta1 = sc.nextInt();
        System.out.println("Insira a carta 2");
        carta2 = sc.nextInt();
        System.out.println("Insira a carta 3");
        carta3 = sc.nextInt();

        /*
         * Eu chamei o método 3 vzs, n era necessário, eu podia apenas ter chamado uma
         * vez antes dos IFs...
         * EXP: int cartasBoas = contadorCartasBoas(carta1, carta2, carta3), e dps fazer
         * os IFs.
         */

        if (contadorCartasBoas(carta1, carta2, carta3) == 1) {
            System.out.println("Truco");

        } else if (contadorCartasBoas(carta1, carta2, carta3) == 2) {
            System.out.println("Seis");

        } else if (contadorCartasBoas(carta1, carta2, carta3) == 3) {
            System.out.println("Nove");

        }
        sc.close();

    }

    public static int contadorCartasBoas(int carta1, int carta2, int carta3) {
        int cartasBoas = 0;

        if (carta1 >= 1 && carta1 <= 3) {
            cartasBoas++;

        }
        if (carta2 >= 1 && carta2 <= 3) {
            cartasBoas++;

        }
        if (carta3 >= 1 && carta3 <= 3) {
            cartasBoas++;

        }
        return cartasBoas;
    }
}
