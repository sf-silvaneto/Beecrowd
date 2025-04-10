import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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