package Uni4;

import java.util.Scanner;

public class FasesDaVida {
    public static void main(String[] args) {
        int idade;
        String resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a idade");
        idade = sc.nextInt();
        if (idade >= 0 && idade <= 5) {
            resultado = "Bebê da mamãe";

        } else if (idade >= 6 && idade <= 12) {
            resultado = "Criança";
        } else if (idade >= 13 && idade < 18) {
            resultado = "Adolescente";

        } else if (idade >= 18 && idade < 60) {
            resultado = "Adulto";
        } else {
            resultado = "Idoso";
        }
        System.out.println(resultado);
        sc.close();

    }

}
