import java.util.Scanner;

public class Main {
 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int resultado = a * 2;
        
        System.out.println(resultado +" minutos");
        
        scan.close();
    }
 
}
 