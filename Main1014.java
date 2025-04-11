import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        Double c = scan.nextDouble();
        Double km = d / c;
        
        System.out.printf("%.3f km/l\n", km);
        
        scan.close();
    }
}