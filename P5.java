import java.util.Scanner;

public class P5 {
    public static void main() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the ISBN code: ");
        long ISBN = reader.nextInt();
        long sum = 0;
        long temp = ISBN;
        long length = String.valueOf(ISBN).length();
        if (length != 10) {
            System.out.println("Illegal ISBN");
            System.exit(0);
        }
        for (long i = 10; temp != 0; i--, temp/=10) {
            long digit = temp % 10;
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
