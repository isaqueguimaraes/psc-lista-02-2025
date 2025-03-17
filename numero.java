import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    int numeroUm;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu número: ");
    numeroUm = scanner.nextInt();

    System.out.println("O numero digitado foi: " + numeroUm);

    scanner.close();
  }

}
