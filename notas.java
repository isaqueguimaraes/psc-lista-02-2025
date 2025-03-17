import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    double bimestreUm, bimestreDois, bimestreTres, bimestreQuatro, media;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Olá. Vamos calcular a sua média.");
    System.out.println("Informe qual foi a sua nota no 1° Bimestre: ");
    bimestreUm = scanner.nextInt();

    System.out.println("Informe qual foi a sua nota no 2° Bimestre: ");
    bimestreDois = scanner.nextInt();

    System.out.println("Informe qual foi a sua nota no 3° Bimestre: ");
    bimestreTres = scanner.nextInt();

    System.out.println("E por fim, informe qual foi a sua nota no 4° Bimestre: ");
    bimestreQuatro = scanner.nextInt();

    media = (bimestreUm + bimestreDois + bimestreTres + bimestreQuatro) / 4;
    System.out.println("A sua média é: " + media);

    scanner.close();
  }
}
