package Uni3;

import java.util.Scanner;

public class Exemplometodo {
    public static void main(String[] args) {
        // Essa classe aq vai ser mais desorganizada. pois estou aprendendo metodos...
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        a = lerNumero(sc);
        b = lerNumero(sc);
        int resultado = somar(a, b);
        imprimirResultado(resultado);
        a = lerNumero(sc);
        b = lerNumero(sc);
        resultado = subtrair(a, b);
        imprimirResultado(resultado);
        sc.close();

    }

    // public = chamado de qualquer file, private é o oposto.
    // escopo-tipo-nome-parametros
    public static int somar(int a, int b) {
        return a + b;

    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static void imprimirResultado(int resultado) {
        System.out.println("O resultado é " + resultado);
    }

    public static int lerNumero(Scanner sc) {
        System.out.println("Digite um número:");
        return sc.nextInt();
    }

}
/*Oval - início / fim
Paralelogramo - lê / escreve
Retângulo - faz/processo
Losango - pergunta
Seta - caminho */
