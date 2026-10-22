package ProvaAv1Uni4;

import java.util.Scanner;

public class ProvaCQ2 {
    public static void main(String[] args) {
        int anoNascimento, anoAtual;
        char brasileiroOuNao;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento:");
        anoNascimento = sc.nextInt();
        System.out.println("Digite o ano atual:");
        anoAtual = sc.nextInt();
        System.out.println("É brasileiro? (S/N):");
        brasileiroOuNao = Character.toUpperCase(sc.next().charAt(0));

        if (anoNascimento < 1900 || anoNascimento > anoAtual) {
            System.out.println("Dados inválidos");

        } else if (brasileiroOuNao == 'N') {
            System.out.println("Estrangeiro: não vota");

        } else {
            int idade = anoAtual - anoNascimento;
            if (idade < 16) {
                System.out.println("Não pode votar");

            } else if (idade >= 18 && idade <= 70) {
                System.out.println("Voto obrigatório");

            } else {
                System.out.println("Voto facultativo");
            }
        }
        sc.close();

    }

}
