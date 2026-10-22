package Uni4;

import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        int diaVencimento, diaPagamento, diasAtraso;
        double valorPrestacao, valorFinal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o dia do vencimento");
        diaVencimento = sc.nextInt();
        System.out.println("Insira o dia do pagamento");
        diaPagamento = sc.nextInt();
        System.out.println("Insira o valor da prestação");
        valorPrestacao = sc.nextDouble();

        if (diaPagamento <= diaVencimento) {
            valorFinal = valorPrestacao * 0.90;
            System.out.println("O pagamento está em dia. O valor da prestação = R$" + valorFinal);

        } else if (diaPagamento <= diaVencimento + 5) {
            valorFinal = valorPrestacao;
            System.out.println("O pagamento está atrasado. Perdeu o desconto. O valor da prestação = R$" + valorFinal);

        } else {
            diasAtraso = diaPagamento - diaVencimento;
            valorFinal = valorPrestacao + (valorPrestacao * (diasAtraso * 0.02));
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$ " + valorFinal);

        }
        sc.close();
    }
}