package Uni3;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        double preco;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do calçado:");
        preco = sc.nextDouble();
        double valordodesconto = preco * 0.12;
        double valorfinal = preco - valordodesconto;
        System.out.println("O valor do desconto é de R$" + valordodesconto);
        System.out.println("O preço do par de sapatos com desconto é R$" + valorfinal);
        sc.close();

    }

}
