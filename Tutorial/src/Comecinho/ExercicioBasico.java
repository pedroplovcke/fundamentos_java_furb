import java.util.Scanner;

public class ExercicioBasico {
    public static void main(String[] args) {

        String nome;
        int idade;
        char sexo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        nome = sc.nextLine();
        System.out.println("Digite sua idade");
        idade = sc.nextInt();
        System.out.println("Digite seu sexo");
        // o "charAt é para pegar apenas a primeira letra da palavra q vai no Scanner."
        sexo = sc.next().charAt(0);

        System.out.println(nome + " tem " + idade + " anos, e seu sexo é: " + sexo);
        sc.close();

    }

}
