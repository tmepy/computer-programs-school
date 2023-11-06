import java.util.Scanner;

// Write a program to input a number and print whether the number is a special or not. A number is said to be a special
// number if the sum of factorial of digits is equal to the original number. For example 145 is a special number as 1! +
// 4! + 5! = 145
public class P1 {
    public static void main(String[] args) {
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
