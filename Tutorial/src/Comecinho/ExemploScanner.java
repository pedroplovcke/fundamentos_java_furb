import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        System.out.println("digite a sua idade:");
        Scanner sc = new Scanner(System.in);
        int idade;
         idade = sc.nextInt();
        System.out.println("a idade digitada é " + idade);
        sc.close();
    }

}
