import java.util.Scanner;
import java.util.Locale;

public class Main1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        double a = scanner.nextDouble();
        double r = 3.14159 * a * a;

        System.out.printf("A=%.4f\n", r);

        scanner.close();
    }
}