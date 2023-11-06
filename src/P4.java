import java.util.Scanner;

// 4)A prime number is said to be Twisted Prime, if the new number obtained after reversing the digits is also a prime number.
// Write a program to accept a number and check whether the number is Twisted Prime or not.
public class P4 {
    private boolean checkPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    private int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        P4 obj = new P4();
        int num = reader.nextInt();
        if (obj.checkPrime(num)) {
            if (obj.checkPrime(obj.reverse(num))) {
                System.out.println(num + " is a twisted prime number");
            }
            else {
                System.out.println(num + " is not a twisted prime number");
            }
        }
        else {
            System.out.println(num + " is not a twisted prime number");
        }
    }
}
