import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        double salario, totalvendas, total;
        String nome="";

        nome = scanner.next();
        salario = scanner.nextDouble();
        totalvendas = scanner.nextDouble();

        total=salario + (totalvendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}