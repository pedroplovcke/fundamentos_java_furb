package Uni4;

import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        int idadeM1, idadeM2, idadeF1, idadeF2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a idade do homem 1");
        idadeM1 = sc.nextInt();

        System.out.println("Insira a idade do homem 2");
        idadeM2 = sc.nextInt();

        System.out.println("Insira a idade da mulher 1");
        idadeF1 = sc.nextInt();

        System.out.println("Insira a idade da mulher 2");
        idadeF2 = sc.nextInt();

        int homemMaisVelho;
        int homemMaisNovo;
        int mulherMaisVelha;
        int mulherMaisNova;

        if (idadeM1 > idadeM2) {
            homemMaisVelho = idadeM1;
            homemMaisNovo = idadeM2;
        } else {
            homemMaisVelho = idadeM2;
            homemMaisNovo = idadeM1;
        }

        if (idadeF1 > idadeF2) {
            mulherMaisVelha = idadeF1;
            mulherMaisNova = idadeF2;
        } else {
            mulherMaisVelha = idadeF2;
            mulherMaisNova = idadeF1;
        }

        int somaMaisVelhoComMaisNova = homemMaisVelho + mulherMaisNova;
        int produtoMaisNovoComMaisVelha = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma: " + somaMaisVelhoComMaisNova);
        System.out.println("Produto: " + produtoMaisNovoComMaisVelha);

        sc.close();
    }
}
