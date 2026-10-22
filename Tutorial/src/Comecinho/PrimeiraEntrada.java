import java.util.Scanner;

public class PrimeiraEntrada {

    public static void main(String[] args) {
        // calcular a média da disciplina introdução a programação.
        float prova1, prova2, trabalhofinal, mediadostrabalhos;
        float mediafinal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua prova1");
        prova1 = sc.nextFloat();
        System.out.println("Digite sua prova2");
        prova2 = sc.nextFloat();
        System.out.println("Digite seu trabalho final");
        trabalhofinal = sc.nextFloat();
        System.out.println("Digite a média dos trabalhos");
        mediadostrabalhos = sc.nextFloat();

        mediafinal = (prova1 * 0.2f) +

                (prova2 * 0.2f) +
                (trabalhofinal * 0.3f) +
                (mediadostrabalhos * 0.2f);

        System.out.printf("A média final é %.2f ", mediafinal);
        sc.close();

    }
}
