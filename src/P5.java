import java.util.Scanner;

// The International Standard Book Number (ISBN) is a unique number book identifier which is printed on every book.
// The ISBN is based upon a 10 digit code. The ISBN is legal if:
//1 x digit+2x digit2+3x digit3 + 4 x digit4 +5 x digits +6 x digit6 +7 x digit7+8x digit8+9x digit9+10 x digit10 is divisible by 11.
//Example: For 1401601499 Sum 1x1+2x4+3x0+4x1+5x6+6x0+7x1+8x4+9x9+10x 9 is divisible by 11.
//Write a program to:
//(i) Input the ISBN code as a 10 digit integer.
//(ii.) If the ISBN is not a 10 digit integer, output the message, "Illegal ISBN" and terminate the program.
//(iii.) If the number is 10 digits, extract the digits of the number and compute the sum as explained above.
//
//If the sum of the digits is divisible by 11, output message, "Legal ISBN" If the sum is not divisible by 11, output the message, "Illegal ISBN".
public class P5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the ISBN code: ");
        int ISBN = reader.nextInt();
        int sum = 0;
        int temp = ISBN;
        int length = String.valueOf(ISBN).length();
        if (length != 10) {
            System.out.println("Illegal ISBN");
            System.exit(0);
        }
        for (int i = 10; temp != 0; i--, temp/=10) {
            int digit = temp % 10;
            sum += i * digit;
        }
        if (sum % 11 == 0) {
            System.out.println("Legal ISBN");
        }
        else {
            System.out.println("Illegal ISBN");
        }
    }
}
