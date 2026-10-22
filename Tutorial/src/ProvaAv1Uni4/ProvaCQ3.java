package ProvaAv1Uni4;

import java.util.Scanner;

public class ProvaCQ3 {
    public static void main(String[] args) {
        int lancheEscolhido, quantidade;
        float precoLanche, totalPagamento;
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - X-Salada ....... R$ 18,00");
        System.out.println("2 - X-Bacon ........ R$ 22,00");
        System.out.println("3 - Cachorro-quente R$ 12,00 ");
        System.out.println("4 - Misto-quente ... R$ 9,00");
        System.out.println("Digite o código do lanche:");
        lancheEscolhido = sc.nextInt();

        switch (lancheEscolhido) {
            case 1:
                precoLanche = 18;
                System.out.println("Digite a quantidade:");
                quantidade = sc.nextInt();
                totalPagamento = precoLanche * quantidade;
                System.out.println("Total a pagar: R$" + totalPagamento);

                break;
            case 2:
                precoLanche = 22;
                System.out.println("Digite a quantidade:");
                quantidade = sc.nextInt();
                totalPagamento = precoLanche * quantidade;
                System.out.println("Total a pagar: R$" + totalPagamento);

                break;
            case 3:
                precoLanche = 12;
                System.out.println("Digite a quantidade:");
                quantidade = sc.nextInt();
                totalPagamento = precoLanche * quantidade;
                System.out.println("Total a pagar: R$" + totalPagamento);

                break;
            case 4:
                precoLanche = 9;
                System.out.println("Digite a quantidade:");
                quantidade = sc.nextInt();
                totalPagamento = precoLanche * quantidade;
                System.out.println("Total a pagar: R$" + totalPagamento);

                break;

            default:
                System.out.println("Código inválido");
                break;
        }
        sc.close();
    }

}
