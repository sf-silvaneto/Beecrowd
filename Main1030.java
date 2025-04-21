import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int NC = scan.nextInt();

        for (int i = 1; i <= NC; i++) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int pos = 0;
            for (int j = 2; j <= n; j++) {
                pos = (pos + k) % j;
            }
            System.out.println("Case " + i + ": " + (pos + 1));
        }
        scan.close();
    }
}
