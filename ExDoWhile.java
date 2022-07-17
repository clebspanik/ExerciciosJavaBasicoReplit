//Programa que imprime os valores mínimos e máximos passados 


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int min, max;

    Scanner entradas = new Scanner (System.in);
    System.out.print("Digite o valor minimo: ");
    min = entradas.nextInt();
    System.out.print("Digite o valor maximo: ");
    max = entradas.nextInt();
    do {
      System.out.println (" " + min + " < " + max);
      min ++;
      max--;
    } while (min < max);
    
    System.out.println( " " + " < " + max + " Condição     inválida.");
    
  }
}