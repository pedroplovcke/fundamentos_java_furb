package ProvaAv1Uni4;

import java.util.Scanner;

public class ProvaCQ1 {
    public static void main(String[] args) {
        float nota1, nota2, frequencia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        nota1 = sc.nextFloat();
        System.out.println("Digite a nota 2:");
        nota2 = sc.nextFloat();
        System.out.println("Digite a frequência (%):");
        frequencia = sc.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media >= 6 && frequencia >= 75) {
            System.out.println("Aprovado");
            if (media >= 9) {
                System.out.println("Com louvor");

            }

        } else if (frequencia < 75 || media < 3) {
            System.out.println("Reprovado");

        } else {
            float notaExame = 12 - media;
            System.out.println("Em exame,precisa de:" + notaExame);
        }
        System.out.println("Fim");
        sc.close();

    }

}
