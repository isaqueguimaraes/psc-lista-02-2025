import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    double preco, quantidade, valor;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o preço do litro da gasolina: ");
    preco = scanner.nextDouble();

    System.out.println("Informe qual a quantidade de Litros abastecida: ");
    quantidade = scanner.nextDouble();

    valor = preco * quantidade;
    System.out.println("O valor a ser pago pelo cliente é de: " + valor);

    scanner.close();
  }
}
