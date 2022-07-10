import java.util.Scanner;

public class SwitchCaseEx {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um número entre 1 a 10");
        int numero = entrada.nextInt();
        switch (numero) {
            case 1:
                System.out.println("O número escolhido foi: 1.");
                break;
            case 2:
                System.out.println("O número escolhido foi: 2.");
                break;
            case 3:
                System.out.println("O número escolhido foi: 3.");
                break;
            case 4:
                System.out.println("O número escolhido foi: 4.");
                break;
            case 5:
                System.out.println("O número escolhido foi: 5.");
                break;
            case 6:
                System.out.println("O número escolhido foi: 6.");
                break;
            case 7:
                System.out.println("O número escolhido foi: 7.");
                break;
            case 8:
                System.out.println("O número escolhido foi: 8.");
                break;
            case 9:
                System.out.println("O número escolhido foi: 9.");
                break;
            case 10:
                System.out.println("O número escolhido foi: 10.");
                break;
            default:
                System.out.println("O número escolhido é inválido! Digite um número entre 1 a 10.");
        }
    }

    /*
     * O switch case é uma estrutura de decisão usada quando precisamos testar
     * condições para determinar qual função será executada em seguida. Assim,
     * essa expressão nos permite substituir múltiplos “if else if”, tornando
     * o código criado mais simples, legível e fácil de manter.
     */

    /*
     * switch (expressão): é onde passamos a variável de teste que servirá de
     * referência para as comparações que o programa deve fazer;
     * 
     * case: é onde definimos o valor que será comparado com a variável de teste e o
     * código que será executado caso sejam compatíveis;
     * 
     * break: é a declaração opcional de quebra;
     * 
     * default: é a declaração opcional padrão, na qual definimos o código que deve
     * ser executado, se nenhum dos valores declarados nos cases for compatível com
     * o valor passado na variável de teste.
     */

} // Fim de escopo
