package Uni3;

import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número inteiro:");
        numero = sc.nextInt();
        int centena = numero / 100;
        int unidade = numero % 10;
        int dezena = ((numero - (centena * 100)) - unidade) / 10;
        System.out.printf("%d centena(s), %d dezena(s), %d unidade(s).", centena, dezena, unidade);
        sc.close();

    }

}
