import java.util.Scanner;
import java.util.Arrays;

public class Main1045 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] l = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble() };
        Arrays.sort(l);

        double A = l[2], B = l[1], C = l[0];

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            double A2 = A * A, B2 = B * B, C2 = C * C;

            if (Math.abs(A2 - (B2 + C2)) < 1e-9) System.out.println("TRIANGULO RETANGULO");
            else if (A2 > B2 + C2) System.out.println("TRIANGULO OBTUSANGULO");
            else System.out.println("TRIANGULO ACUTANGULO");

            if (A == B && B == C) System.out.println("TRIANGULO EQUILATERO");
            else if (A == B || B == C || A == C) System.out.println("TRIANGULO ISOSCELES");
        }

        scan.close();
    }
}