import java.util.Scanner;

public class CalculoMediaExercicios {
    public static void main(String[] args) {
        // Mesma coisa que "PrimeiraEntrada.java" porém ao invés de perguntar a média
        // dos exericícios ele pergunta todas as notas dos exercícios por unidade.
        float prova1, prova2, exerciciouni1, exercicouni2, exerciciouni3, exerciciouni4, exerciciouni5, exerciciouni6,
                trabalhofinal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua prova 1");
        prova1 = sc.nextFloat();
        System.out.println("Digite sua prova 2");
        prova2 = sc.nextFloat();
        System.out.println("Digite a nota dos exercícios da uni 1");
        exerciciouni1 = sc.nextFloat();
        System.out.println("Digite a nota dos exercícios da uni 2");
        exercicouni2 = sc.nextFloat();
        System.out.println("Digite a nota dos exercícios da uni 3");
        exerciciouni3 = sc.nextFloat();
        System.out.println("Digite a nota dos exercícios da uni 4");
        exerciciouni4 = sc.nextFloat();
        System.out.println("Digite a nota dos exercícios da uni 5");
        exerciciouni5 = sc.nextFloat();
        System.out.println("Digite a nota dos exercícios da uni 6");
        exerciciouni6 = sc.nextFloat();
        System.out.println("Digite seu trabalho final");
        trabalhofinal = sc.nextFloat();

        float mediadostrabalhos = (exerciciouni1 + exercicouni2 + exerciciouni3 + exerciciouni4 + exerciciouni5
                + exerciciouni6) / 6;
        float mediafinal = (prova1 * 0.2f) + (prova2 * 0.2f) + (mediadostrabalhos * 0.2f) + (trabalhofinal * 0.3f);

        System.out.printf("Sua média final é %.2f você foi "  ,  +mediafinal  );
        sc.close();

        if (mediafinal > 5.9f) {
            System.out.println("Aprovado");

        } else {
            System.out.println("Reprovado");

        }

    }
}
