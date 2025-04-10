import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x1, x2, y1, y2, distancia;
        Scanner scanner = new Scanner(System.in);

        String[] p1 = scanner.nextLine().split(" ");
        String[] p2 = scanner.nextLine().split(" ");

        x1 = Double.parseDouble(p1[0]);
        y1 = Double.parseDouble(p1[1]);
        x2 = Double.parseDouble(p2[0]);
        y2 = Double.parseDouble(p2[1]);

        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("%.4f\n", distancia);

        scanner.close();
    }
}