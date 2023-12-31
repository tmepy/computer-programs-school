import java.util.Scanner;

// Write a program to input a number and check whether it is a Magic number or not Display the message accordingly.
// (Hint- A number is said to be a magic number if the eventual sum of digits of the number is one)
public class P3 {
    private int getSum(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        P3 obj = new P3();
        int num = reader.nextInt();
        int sum = obj.getSum(num);
        while(sum > 9) {
            sum = obj.getSum(sum);
        }
        if (sum == 1) {
            System.out.println(num + " is a magic number");
        } else {
            System.out.println(num + " is not a magic number");
        }
    }
}
