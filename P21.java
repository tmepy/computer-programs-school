import java.util.Scanner;

public class P21 {
    public void generate(int n) {
        int prev, next = 1;
        int sum = 0;
        while(sum <= n) {
            if (sum != 0) System.out.print(", S");
            System.out.print(sum);
            prev = next;
            next = sum;
            sum = prev + next;
        }
    }
    private void generate(int start, int end) {
        for (int i = start + 1; i < end; i++) {
            if (checkPrime(i)) System.out.print(i + " ");
        }
    }
    private boolean checkPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void main() {
        P21 obj = new P21();
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the limit till which you want to generate fibonacci series: ");
        int n = reader.nextInt();
        System.out.print("\nEnter the start of the prime number range: ");
        int start = reader.nextInt();
        System.out.print("Enter the end of the prime number range: ");
        int end = reader.nextInt();
        System.out.println("\n\nFibonacci Series: ");
        obj.generate(n);
        System.out.println("\n\nPrime Numbers between " + start + " and " + end + ": ");
        obj.generate(start, end);
    }
}
