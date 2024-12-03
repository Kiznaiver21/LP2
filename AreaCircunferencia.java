import java.util.Scanner;

public class AreaCircunferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A área da circunferência é: %.2f%n", area);

        scanner.close();
    }
}
