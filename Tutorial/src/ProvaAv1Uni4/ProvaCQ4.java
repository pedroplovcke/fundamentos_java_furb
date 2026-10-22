package ProvaAv1Uni4;

import java.util.Scanner;

public class ProvaCQ4 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 3 dígitos:");
        numero = sc.nextInt();

        if (numero < 100 && numero > 999) {
            System.out.println("Número inválido");

        } else {
            int centena = numero / 100;
            int unidade = numero % 10;
            int dezena = ((numero - (centena * 100)) - unidade) / 10;

            System.out.println("Centena: " + centena);
            System.out.println("Dezena: " + dezena);
            System.out.println("Unidade: " + unidade);

            int somaDosTresDigitos = centena + unidade + dezena;
            System.out.println("Soma dos dígitos: " + somaDosTresDigitos);

            if (centena == unidade) {
                System.out.println("É palíndromo");

            } else {
                System.out.println("Não é palíndromo");
            }

        }
        sc.close();
    }

}
