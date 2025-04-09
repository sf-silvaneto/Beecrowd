
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f, h;
        double s,r;

        f = scanner.nextInt();
        h = scanner.nextInt();
        s = scanner.nextDouble();
        r = s * h;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("NUMBER = "+ f);
        System.out.println("SALARY = U$ " + df.format(r));
        
        scanner.close();
    }
}
