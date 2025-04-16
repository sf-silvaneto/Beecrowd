import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Double valor, a = 4.0, b = 4.5, c = 5.0, d = 2.0, e = 1.5;
    int codigo = scan.nextInt();
    int quantidade = scan.nextInt();
    valor = codigo * quantidade;
    System.out.printf("Total: R$ %.2f\n", valor);
    scan.close();
    }
}