import java.util.Scanner;

public class Main1046 {
 
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int A, B, C, D, HORAS;
    A = scan.nextInt();
    B = scan.nextInt();
    
    if (A - B == 0){
       System.out.println("O JOGO DUROU 24 HORA(S)");
    }
    else if(B > A){
       System.out.println("O JOGO DUROU "+ (B - A) + " HORA(S)");
    }
    else{
       System.out.println("O JOGO DUROU "+ ((24 - A) + B) + " HORA(S)");
    }
    scan.close();
    }
}