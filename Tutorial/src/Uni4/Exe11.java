package Uni4;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        int idade1, idade2, idade3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a idade do primeiro filho.");
        idade1 = sc.nextInt();
        System.out.println("Insira a idade do segundo filho.");
        idade2 = sc.nextInt();
        System.out.println("Insira a idade do terceiro filho.");
        idade3 = sc.nextInt();

        if (idade1 == idade2 && idade2 == idade3) {
            System.out.println("Trigêmeos");

        } else if (idade1 == idade2 || idade1 == idade3 || idade2 == idade3) {
            System.out.println("Gêmeos");

        } else {
            System.out.println("Apenas irmãos");
        }
        sc.close();

    }

}
