import java.util.Scanner;

public class Main1041 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Double A = scan.nextDouble();
      Double B = scan.nextDouble();
      
      if (A == 0 && B == 0){
        System.out.println("Origem");
      } else if (A == 0) {
        System.out.println("Eixo Y");
      } else if (B == 0) {
        System.out.println("Eixo X");
      } else if(A > 0.0 && B > 0.0){
        System.out.println("Q1");
      } else if(A < 0.0 && B > 0.0){
        System.out.println("Q2");
      } else if(A < 0.0 && B < 0.0){
        System.out.println("Q3");
      } else if(A > 0.0 && B < 0.0){
        System.out.println("Q4");
      }
      scan.close();
  }
}