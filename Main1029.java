import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            int n = scan.nextInt();
            int calls = 0;
            int a = 0, b = 1, resultado = 0;

            if (n == 0) {
                resultado = 0;
                calls = 0;
            } else if (n == 1) {
                resultado = 1;
                calls = 0;
            } else {
                for (int j = 2; j <= n; j++) {
                    resultado = a + b;
                    a = b;
                    b = resultado;
                    calls++;
                }
                calls += n - 2;
            }
            System.out.println("fib(" + n + ") = " + calls + " calls = " + resultado);
        }
        scan.close();
    }
}
