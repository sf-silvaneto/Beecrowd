import java.util.Scanner;
import java.util.Locale;

public class Main1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int f, h;
        double s, r;

        f = scanner.nextInt();
        h = scanner.nextInt();
        s = scanner.nextDouble();
        r = s * h;

        System.out.println("NUMBER = " + f);
        System.out.printf("SALARY = U$ %.2f\n", r);

        scanner.close();
    }
}