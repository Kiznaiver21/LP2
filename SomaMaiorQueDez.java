import java.util.Scanner;

public class SomaMaiorQueDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int soma = valor1 + valor2;

        if (soma > 10) {
            System.out.println("O resultado da soma é: " + soma);
        } else {
            System.out.println("O resultado da soma não é maior que 10.");
        }

        scanner.close();
    }
}