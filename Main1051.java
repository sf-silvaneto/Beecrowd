import java.util.Scanner;

public class Main1051 {
 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double imposto = 0.0;

        if (A <= 2000.00) {
            System.out.println("Isento");
        } else {
            if (A <= 3000) {
                imposto = (A - 2000) * 0.08;
            } else if (A <= 4500) {
                imposto = (1000 * 0.08) + ((A - 3000) * 0.18);
            } else {
                imposto = (1000 * 0.08) + (1500 * 0.18) + ((A - 4500) * 0.28);
            }
            System.out.printf("R$ %.2f\n", imposto);
        }

        scan.close();
    }
}