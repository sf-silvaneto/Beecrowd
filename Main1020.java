import java.util.Scanner;

public class Main {
 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dias, sobrou;
        dias = scan.nextInt();
        
        System.out.printf("%d ano(s)\n", dias/365);
        sobrou = (dias%365);

        System.out.printf("%d mes(es)\n", sobrou/30);
        sobrou = (sobrou%30);

        System.out.printf("%d dia(s)\n", sobrou);
        
        scan.close();

    } 
}