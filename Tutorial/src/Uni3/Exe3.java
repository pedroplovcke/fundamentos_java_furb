package Uni3;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        double precodolitro;
        double pagamento;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o preço por litro da gasolina:");
        precodolitro = sc.nextDouble();
        System.out.println("Informa o valor do pagamento:");
        pagamento = sc.nextDouble();
        // Variável "capacidade" para saber quanto ele conseguiu colocar no tanque.
        double capacidade = pagamento / precodolitro;
        System.out.printf("O motorista conseguiu colocar: %.2f litros de gasolina.", capacidade);
        sc.close();

    }

}
