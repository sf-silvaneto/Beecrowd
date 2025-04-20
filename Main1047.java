import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A, B, C, D, TEMPO, HORAS, MINUTOS;

        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();

        TEMPO = ((C * 60 + D) - (A * 60 + B));

        if (TEMPO <= 0){
            TEMPO += 24 * 60;
        }
        HORAS = TEMPO / 60;
        MINUTOS = TEMPO % 60;
        System.out.println("O JOGO DUROU " + HORAS + " HORA(S) E " + MINUTOS + " MINUTO(S)");
        scan.close();
    }
}