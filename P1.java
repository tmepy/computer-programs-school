import java.util.Scanner;

public class P1 {
    public static void main() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        int sum = 0;
        int product = 1;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            for (int i = 1; i <= digit; i++) {
                product *= i;
            }
            sum += product;
            product = 1;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is a special number");
        } else {
            System.out.println(num + " is not a special number");
        }
    }
}
