package Uni4;

import java.util.Scanner;

public class Exe20 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, mediaExercicios, mediaAproveitamento;
        char conceito;
        String situacao;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a nota 1");
        nota1 = sc.nextDouble();
        System.out.println("Insira a nota 2");
        nota2 = sc.nextDouble();
        System.out.println("Insira a nota 3");
        nota3 = sc.nextDouble();
        System.out.println("Insira a média dos exercícios");
        mediaExercicios = sc.nextDouble();

        mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7.0;

        if (mediaAproveitamento >= 9.0) {
            conceito = 'A';
            situacao = "Aprovado";

        } else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
            conceito = 'B';
            situacao = "Aprovado";

        } else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
            conceito = 'C';
            situacao = "Aprovado";

        } else if (mediaAproveitamento >= 4.0 && mediaAproveitamento < 6.0) {
            conceito = 'D';
            situacao = "Reprovado";

        } else {
            conceito = 'E';
            situacao = "Reprovado";

        }

        System.out.printf("A média de aproveitamento foi: %.2f. Conceito: %c. %s\n", mediaAproveitamento, conceito, situacao);

        sc.close();
    }
}