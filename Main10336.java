import java.util.Scanner;

public class Main10336 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double A, B, C;
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        
         double delta = B*B - 4*A*C;
        
        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
            return;
        }
        
        double raizDelta = Math.sqrt(delta);
        double R1 = (-B + raizDelta) / (2*A);
        double R2 = (-B - raizDelta) / (2*A);
        
        System.out.printf("R1 = %.5f\nR2 = %.5f\n", R1, R2);
        scan.close();
    }
}