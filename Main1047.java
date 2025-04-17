public import java.util.Scanner;

public class Main1047 {
 
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int A, B, C, D, TEMPO, HORAS, MINUTOS;
    A = scan.nextInt();
    B = scan.nextInt();
    C = scan.nextInt();
    D = scan.nextInt();
    
    TEMPO = ((C * 60 + D) - (A * 60 + B));
    HORAS = TEMPO / 60;
    MINUTOS = TEMPO - HORAS*60;
    
    if (HORAS + MINUTOS == 0){
       System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
    }
    else{
       System.out.println("O JOGO DUROU "+ HORAS + " HORA(S) E "+ MINUTOS + " MINUTO(S)" );
    }
    scan.close();
    }
}
