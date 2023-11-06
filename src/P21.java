import java.util.Scanner;

public class P21 {
    public void generate(int n) {
        int prev, next = 1;
        int sum = 0;
        while(sum <= n) {
            System.out.print(sum + " ");
            prev = next;
            next = sum;
            sum = prev + next;
        }
    }
    private void generate(int start, int end) {
        for (int i = start; i <= end; i++) {
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
    public static void main(String[] args) {
        P21 obj = new P21();
        Scanner reader = new Scanner(System.in);
        System.out.println("(1) Generate Fibonacci series");
        System.out.println("(2) Generate prime numbers");
        System.out.print("Choose an option: ");
        int option = reader.nextInt();
        switch (option) {
            case 1:
                System.out.print("Enter the limit: ");
                int n = reader.nextInt();
                obj.generate(n);
                break;
            case 2:
                System.out.print("Enter the start of the range: ");
                int start = reader.nextInt();
                System.out.print("Enter the end of the range: ");
                int end = reader.nextInt();
                obj.generate(start, end);
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
