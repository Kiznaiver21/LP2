import java.util.Scanner;

public class CalculoGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância a ser percorrida (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o preço do litro da gasolina: ");
        double precoGasolina = scanner.nextDouble();

        double litrosNecessarios = distancia / 12.0;
        double custo = litrosNecessarios * precoGasolina;

        System.out.printf("Você precisará de %.2f litros de gasolina.%n", litrosNecessarios);
        System.out.printf("O custo será de R$ %.2f.%n", custo);

        scanner.close();
    }
}
