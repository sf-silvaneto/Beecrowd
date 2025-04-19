import java.util.Scanner;

public class Main1048 {
 
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double A = scan.nextDouble();
    
     if (A > 2000){
            double novoSalario = A * 1.04;
            double reajuste = novoSalario - A;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 4 %");
     }else if (A > 1200){
            double novoSalario = A * 1.07;
            double reajuste = novoSalario - A;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 7 %");
     }else if (A > 800){
            double novoSalario = A * 1.10;
            double reajuste = novoSalario - A;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 10 %");
     }else if (A > 400){
            double novoSalario = A * 1.12;
            double reajuste = novoSalario - A;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 12 %");
     }else{
            double novoSalario = A * 1.15;
            double reajuste = novoSalario - A;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 15 %");
     }
     scan.close();
    }
}