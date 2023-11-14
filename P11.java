import java.util.Scanner;

public class P11 {
    int n, x;
    private boolean checkPrime(double num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num/2.0; i++) {
            if (num % i == 0.0) return false;
        }
        return true;
    }
    private void S2() {
        System.out.println("\nSeries 2");
        double sum = 0;
        double current_num = 2.0;
        for (int i = 1; i <= n; i++) {
            while (!checkPrime(current_num)) {
                current_num++;
            }
            sum += current_num/Math.pow(x, i);
            current_num++;
        }
        System.out.println(sum);
    }
    private void S1() {
        System.out.println("Series 1");
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            if (i % 2 == 0) sum -= x/factorial;
            else sum += x/factorial;
        }
        System.out.println(sum);
    }

    public static void main() {
        Scanner reader = new Scanner(System.in);
        P11 obj = new P11();
        System.out.print("Enter the value of n: ");
        obj.n = reader.nextInt();
        System.out.print("Enter the value of x: ");
        obj.x = reader.nextInt();
        obj.S1();
        obj.S2();
    }
}
