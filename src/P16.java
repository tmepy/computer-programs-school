import java.util.Scanner;

public class P16 {
    private void Pattern1() {
        for (int i = 65; i <= 90; i++) {
            System.out.println((char) i + "\t\t" + i);
        }
    }
    private void Pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j + "\t");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        P16 obj = new P16();
        Scanner reader = new Scanner(System.in);
        System.out.println("(1) Pattern 1 - Displays the alphabets from A to Z with their corresponding ASCII values");
        System.out.println("(2) Pattern 2 - Displays the numbers from 1 to 5 in a pattern.");
        System.out.print("Enter the pattern number: ");
        int pattern = reader.nextInt();
        switch (pattern) {
            case 1:
                obj.Pattern1();
                break;
            case 2:
                obj.Pattern2();
                break;
            default:
                System.out.println("Invalid pattern number");
        }
    }
}
