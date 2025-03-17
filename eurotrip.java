import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    int pessoas;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Olá! Vamos calcular o valor total de sua Eurotrip.");
    System.out.println("Digite o número de pessoas que irão a esta viagem: ");
    pessoas = scanner.nextInt();

    double viagemAle, viagemPor, viagemIta, total;

    System.out.println("Primeiro digite qual é o valor atual da viagem à Alemanha: ");
    viagemAle = scanner.nextDouble();

    System.out.println("Agora digite qual é o valor atual da viagem à Portugal: ");
    viagemPor = scanner.nextDouble();

    System.out.println("Digite agora qual é o valor atual da viagem à Itália: ");
    viagemIta = scanner.nextDouble();

    total = (viagemAle + viagemPor + viagemIta) * pessoas;
    System.out.println("O valor total da viagem será de: R$" + total);

    scanner.close();
  }
}
