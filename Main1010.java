import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, q1, q2;
        Double v1, v2;

        n1 = scanner.nextInt();
        q1 = scanner.nextInt();
        v1 = scanner.nextDouble(); 
        n2 = scanner.nextInt();
        q2 = scanner.nextInt();
        v2 = scanner.nextDouble();
        Double total = (q1 * v1) + (q2 * v2);  
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

    }

}