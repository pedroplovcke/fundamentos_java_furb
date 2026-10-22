package Uni2;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        // Leia os quatro valores correspondentes aos eixos x e y de dois pontos
        // quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles,
        // mostrando 4 casas decimais após a vírgula, segundo a fórmula:
        double x1;
        double y1;
        double x2;
        double y2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o x1:");
        x1 = sc.nextDouble();
        System.out.println("Insira o y1:");
        y1 = sc.nextDouble();
        System.out.println("Insira o x2");
        x2 = sc.nextDouble();
        System.out.println("Insira o y2");
        y2 = sc.nextDouble();
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));
        System.out.printf("Resultado = %.4f", distancia);
        sc.close();

    }

}
