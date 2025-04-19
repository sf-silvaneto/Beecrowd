import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Double A, B;
      A = scan.nextDouble();
      B = scan.nextDouble();
      
      if (B % A == 0 || A % B == 0){
        System.out.println("Sao Multiplos");
      }else{
        System.out.println("Nao sao Multiplos");
        }
        scan.close();
    }        
}