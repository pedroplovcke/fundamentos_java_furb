package Uni3;

import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        double dolares;
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor em doláres recebido pelo cliente:");
        dolares = sc.nextDouble();
        double valoremreais = dolares * 5.65;
        System.out.printf("O atendente deve devolver R$%.2f para o cliente.", valoremreais);
        sc.close();
    }

}
