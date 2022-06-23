import java.util.Scanner;

  
class Main {
  public static void main(String[] args) {

  int n, s = 0;
  String res;
  Scanner teclado = new Scanner(System.in);
    do {
        System.out.println("Digite um número");
      n = teclado.nextInt();
      s += n;// s = s + n
      System.out.println("Quer continuar? [s/n] ");
      res = teclado.next();
    } while (res.equals("s"));
    System.out.println("A Soma de todos os valores é " + s);
  }
}