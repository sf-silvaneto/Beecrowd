import java.util.Scanner;

public class Main1013 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b,c,maior,maior2;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt(); 
        maior = (a + b + Math.abs(a - b)) / 2;
        maior2 = (maior + c + Math.abs(maior - c)) / 2;
        
        System.out.println(maior2 +" eh o maior");
        
        scan.close();
    }
     
    
}