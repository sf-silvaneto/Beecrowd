import java.util.Scanner;

public class Main1022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        while (N-- > 0) {
            int N1 = sc.nextInt(); sc.next(); int D1 = sc.nextInt();
            char op = sc.next().charAt(0);
            int N2 = sc.nextInt(); sc.next(); int D2 = sc.nextInt();
            
            int num = 0, den = 0;
            
            if (op == '+') { num = N1*D2 + N2*D1; den = D1*D2; }
            else if (op == '-') { num = N1*D2 - N2*D1; den = D1*D2; }
            else if (op == '*') { num = N1*N2; den = D1*D2; }
            else if (op == '/') { num = N1*D2; den = N2*D1; }
            
            int gcd = mdc(num, den);
            gcd = Math.abs(gcd);
            
            System.out.printf("%d/%d = %d/%d%n", num, den, num/gcd, den/gcd);
        }
    }
    static int mdc(int a, int b) {
        return b == 0 ? a : mdc(b, a % b);
    }
}