
import java.util.Scanner;

//Estrutura condicional que a avaliza se o usuário pode dirigir considerando a sua idade;

public class ExercicioEntradaTeclado {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a sua idade:");

        int idade = teclado.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade, pode dirigir!");

        } else {

            System.out.println("Tu não tem idade, não pode dirigir!");
        }

    }

}
