package Uni4;

import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        char letra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma letra.");
        letra = sc.next().toUpperCase().charAt(0);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("É vogal.");

        } else {
            System.out.println("Não é vogal.");
        }
        sc.close();

    }

}
