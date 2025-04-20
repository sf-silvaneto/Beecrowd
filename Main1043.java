import java.util.Scanner;

public class Main1043 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Double A, B, C, perimetro, area;
      A = scan.nextDouble();
      B = scan.nextDouble();
      C = scan.nextDouble();
      area = ((A + B) * C) / 2;
      perimetro = A + B + C;
      
      if (A + B > C && A + C > B && B + C > A) {
          System.out.printf("Perimetro = %.1f\n", perimetro);
      } else {
          System.out.printf("Area = %.1f\n", area);
      }
      scan.close();
    }        
}