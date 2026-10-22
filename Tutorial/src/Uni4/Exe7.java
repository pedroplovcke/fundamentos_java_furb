package Uni4;

import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        // O exemplo de saída está errada no github.
        float pesoCarta;
        float valorAPagar;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o peso da carta (Em gramas).");
        pesoCarta = sc.nextFloat();

        if (pesoCarta <= 50) {
            valorAPagar = 0.45f;
            System.out.println("R$" + valorAPagar);

        } else {
            float pesoExcedido = pesoCarta - 50;
            int qtAdicional = (int) Math.ceil(pesoExcedido / 20);
            valorAPagar = 0.45f + 0.45f * qtAdicional;
            System.out.println("R$" + valorAPagar);

        }
        sc.close();
    }

}
