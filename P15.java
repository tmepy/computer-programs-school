import java.util.Scanner;

public class P15 {
    private void Pattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) System.out.print("#\t");
                else System.out.print("*\t");
            }
            System.out.println();
        }
    }
    private void Pattern2() {
        int num = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--, num++){
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
    public static void main() {
        P15 obj = new P15();
        Scanner reader = new Scanner(System.in);
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
