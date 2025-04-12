import java.util.Scanner;
public class Main1017 {
 
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a,b;
    Double  r;
    a = scan.nextInt();
    b = scan.nextInt();
    r = b/12.0*a;
    
    System.out.printf("%.3f\n", r);
    
    scan.close();
 
    }
 
}