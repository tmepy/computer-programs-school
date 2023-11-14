import java.util.Scanner;

public class P6 {
    int time;
    public P6 (int time) { this.time = time; }
    private int getWage() {
        if (time <= 48) return time * 1000;
        else if (time <= 56) return 48 * 1000 + (time - 48) * 1250;
        else return 48 * 1000 + 8 * 1250 + (time - 56) * 1500;
    }
    public static void main() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of hours worked: ");
        P6 obj = new P6(reader.nextInt());
        System.out.println("Wage to be paid: ₹" + obj.getWage());
    }
}
