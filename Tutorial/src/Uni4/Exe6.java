package Uni4;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        char sexo;
        Scanner sc = new Scanner(System.in);

        System.out.println("M-Masculino");
        System.out.println("F-Feminino");
        System.out.println("I-Não informado");

        System.out.println("Escolha uma dessas opções acima.");
        sexo = Character.toUpperCase(sc.next().charAt(0));

        switch (sexo) {
            case 'M':
                System.out.println("Masculino");

                break;
            case 'F':
                System.out.println("Feminino");
                break;
            case 'I':
                System.out.println("Não informado");
                break;

            default:
                System.out.println("Entrada incorreta");
                break;
        }
        sc.close();
    }

}
