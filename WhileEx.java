import java.util.Scanner;

//Construa um programa utilizando a música da Xuxa 

public class WhileEx {

    public static void main(String[] args) {

        int patinho;
        int contagem;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de patos: ");
        patinho = entrada.nextInt(); // patinho = a entrada de teclado que é o número

        contagem = patinho - 1;

        while (contagem >= 1) {
            System.out.println(patinho
                    + " patinhos foram passear além das montanhas para brincar, a mamãe gritou: quá, quá, quá, quá, mas só "
                    + (contagem--) + " patinhos voltaram de lá");

        }
        System.out.println(patinho
                + " patinhos foram passear Além das montanhas, Para brincar, a mamãe gritou: quá, quá, quá, quá Mas nenhum patinho voltou de la\"");
        System.out.println(
                "A mamãe patinha foi procurar, além das montanhas, na beira do mar, a mamãe gritou: quá, quá, quá, quá e os "
                        + patinho + " patinhos voltaram de lá");

    }

}
