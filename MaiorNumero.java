import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }

        scanner.close();
    }
}
