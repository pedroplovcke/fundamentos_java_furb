package Uni3;

import java.util.Scanner;

public class ExemploMetodo2 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4;
        Scanner sc = new Scanner(System.in);
        nota1 = lernota(sc, 1);
        nota2 = lernota(sc, 2);
        nota3 = lernota(sc, 3);
        nota4 = (obternotadaunidade(sc, 1) +
                obternotadaunidade(sc, 2) +
                obternotadaunidade(sc, 3) +
                obternotadaunidade(sc, 4) +
                obternotadaunidade(sc, 5) +
                obternotadaunidade(sc, 6)) / 6;
        float media = calculomedia(nota1, nota2, nota3, nota4);
        exibirresultado(media);

    }

    private static float lernota(Scanner sc, int indice) {
        System.out.println("Digite a nota " + indice + " do aluno");
        return sc.nextFloat();

    }

    private static float obternotadaunidade(Scanner sc, int unidade) {
        System.out.println("Digite a nota da unidade " + unidade);
        return sc.nextFloat();

    }

    private static float calculomedia(float nota1, float nota2, float nota3, float nota4) {
        return nota1 * 0.2f + nota2 * 0.3f + nota3 * 0.3f + nota4 * 0.2f;

    }

    private static void exibirresultado(float media) {
        if (media >= 6) {
            System.out.printf("Aprovado com média %.2f", media);

        } else {
            System.out.printf("Reprovado com média %.2f", media);
        }
    }

}
