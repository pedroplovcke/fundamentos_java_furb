import java.util.Scanner;

public class ConfereNome {
    public static void main(String[] args) {
        String nome = "Pedro";
        String nomeInserido;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do usuário");
        nomeInserido = sc.next();

        sc.close();
        if (nome.equalsIgnoreCase(nomeInserido)) {
            System.out.println("Bem vindo, " + nome + "." );

        } else {
            System.out.println("Nome incorreto.");

        }

    }

}
