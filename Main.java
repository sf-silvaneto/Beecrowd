import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome = scanner.nextLine();
        Double salario = scanner.nextDouble();
        Double vendas = scanner.nextDouble();
        Double comissao = vendas * 0.15;
        Double salarioFinal = salario + comissao;

        System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);

        scanner.close();
    }
}