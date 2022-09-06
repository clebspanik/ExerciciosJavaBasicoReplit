import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

class Main {


  /* Imprimir os trinta primeiros números da sequência Fibonacci */
  public static void main(String[] args) {
    int a = 1;
    int b = 0;
    int aux;
    

    for (int i = 0; i < 30;  i++){
      System.out.println(a);
      aux = a;
      a = a + b;
      b = aux;
    }
  }
}