import java.util.Scanner;

// A number is said to be Composite if the number has more than one factor excluding 1 and the number itself. Write a
// program in Java to enter a number and check whether it is a composite number or not
public class P2 {
    int num;
    private boolean checkPrime() {
        if (num <= 1) return false;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        P2 obj = new P2();
        obj.num = reader.nextInt();
        if (obj.checkPrime()) {
            System.out.println(obj.num + " is not a composite number");
        }
        else {
            System.out.println(obj.num + " is a composite number");
        }
    }
}