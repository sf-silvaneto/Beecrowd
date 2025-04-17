import java.util.Scanner;

public class Main1038 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A, B; 
        A = scan.nextDouble();
        B = scan.nextDouble();

        if (A == 1) {
            System.out.printf("Total: R$ %.2f\n", B * 4);
        } else if (A == 2) {
            System.out.printf("Total: R$ %.2f\n", B * 4.5);
        } else if (A == 3) {
            System.out.printf("Total: R$ %.2f\n", B * 5);
        } else if (A == 4) {
            System.out.printf("Total: R$ %.2f\n", B * 2);
        } else if (A == 5) {
            System.out.printf("Total: R$ %.2f\n", B * 1.5);
        } else {
            System.out.println("Código inválido.");
        }

        scan.close();
    }
}