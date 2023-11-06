import java.util.Scanner;

public class P10 {
    private void S1(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        if (i < n) System.out.print(", ");
    }
}
    private void S2(int n) {
        double total_sum = 0;
        for (int i = 1; i <= n; i++) {
            double loop_sum = 0;
            double product = 1;
            for (int j = 1; j <= i; j++) {
                loop_sum += j;
                product *= j;
            }
            total_sum += loop_sum/product;
        }
        System.out.println(total_sum);
    }
    public static void main (String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Choose a type of pattern by typing (1) or (2): ");
        int choice = reader.nextInt();
        P10 obj = new P10();
        switch (choice) {
            case 1:
                System.out.print("Enter number of terms: ");
                int n = reader.nextInt();
                obj.S1(n);
                break;
            case 2:
                System.out.print("Enter number of terms: ");
                int m = reader.nextInt();
                obj.S2(m);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }
    }
}
