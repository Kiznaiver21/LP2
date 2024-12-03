import java.util.Scanner;

public class SalarioOperario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        double salario = horasTrabalhadas * 20.0;
        System.out.printf("O salário do operário é R$ %.2f%n", salario);

        scanner.close();
    }
}

