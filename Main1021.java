import java.util.Scanner;

public class Main1021 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double dinheiro = scan.nextDouble();
        double[] valor = { 100, 50, 20, 10, 5, 2, 1.0, 0.50, 0.25, 0.10, 0.05, 0.01 };
        int qtd_notas=(int)dinheiro;
        int qtd_moedas= (int)((dinheiro - qtd_notas) * 100);
        //final int a=2;

        System.out.println("NOTAS:");
        for (int i=0;i<6;i++)
        {
            qtd_notas = (int)(dinheiro / valor[i]);
            System.out.printf("%d nota(s) de R$ %.2f\n",qtd_notas, valor[i]);
            dinheiro -= qtd_notas * valor[i];

        }
        System.out.println("MOEDAS:");
        for (int i = 6; i <= 11; i++)
        {
            qtd_moedas = (int)(dinheiro / valor[i]);
            System.out.printf("%d moeda(s) de R$ %.2f\n",qtd_moedas, valor[i]);
            dinheiro -= qtd_moedas * valor[i];
            dinheiro = Math.round(dinheiro * 100.0)/100.0;
        }    
        scan.close();
    } 
}