import java.util.Scanner;

public class P22 {
    void series(int x, int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i);
        }
        System.out.println("Sum of the series: " + sum);
    }
    void series(int p) {
        for (int i = 1; i <= p; i++) {
            System.out.print((int) Math.pow(i, 3) - 1);
            if (i < p) System.out.print(", ");
        }
    }
    void series() {
        double sum = 0;
        for (int i = 1; i <= 10; i++) sum +=  1.0/i;
        System.out.println("Sum of the series: " + sum);
    }

    public static void main() {
        Scanner reader = new Scanner(System.in);
        P22 obj = new P22();
        System.out.println("(1) Sum of the series x + x^2 + x^3 + ... + x^n");
        System.out.println("(2) Print the series 1^3 - 1, 2^3 - 1, 3^3 - 1, ... , n^3 - 1");
        System.out.println("(3) Sum of the series 1 + 1/2 + 1/3 + ... + 1/10");
        System.out.print("Choose an option: ");
        int option = reader.nextInt();
        switch (option) {
            case 1:
                System.out.print("Enter the value of x: ");
                int x = reader.nextInt();
                System.out.print("Enter the value of n: ");
                int n = reader.nextInt();
                obj.series(x, n);
                break;
            case 2:
                System.out.print("Enter the value of n: ");
                int p = reader.nextInt();
                obj.series(p);
                break;
            case 3:
                obj.series();
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}

