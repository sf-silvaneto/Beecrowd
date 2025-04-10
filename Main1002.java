import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        double a = scanner.nextDouble();
        double r = 3.14159 * a * a;

        System.out.printf("A=%.4f\n", r);

        scanner.close();
    }
}