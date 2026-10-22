package Uni3;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        double altura;
        double comprimento;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a altura:");
        altura = sc.nextDouble();
        System.out.println("Insira o comprimento:");
        comprimento = sc.nextDouble();
        // Na variável área já implementei * 9 pois, é preciso de 9 azulejos por metro
        // quadrado e também 12.50 q é o preço por cada azulejo.
        double valorarea = (comprimento * altura) * (9 * 12.50);
        System.out.printf("O valor final é R$%.2f.", valorarea);
        sc.close();

    }

}
