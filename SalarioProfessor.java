import java.util.Scanner;

public class SalarioProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora-aula: ");
        double valorHoraAula = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto do INSS (em %): ");
        double percentualINSS = scanner.nextDouble();

        double salarioBruto = valorHoraAula * horasTrabalhadas;
        double descontoINSS = salarioBruto * (percentualINSS / 100);
        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto INSS: R$ %.2f%n", descontoINSS);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}
