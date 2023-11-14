import java.util.Scanner;

public class P8 {
    Scanner reader = new Scanner(System.in);
    private double calculateTermDeposit(double P, double n, double r) {
        return P * Math.pow ((1 + (r / 100)), n ) ;
    }
    private double calculateRecurringDeposit(double P, double n, double r) {
        return P * n + P * ((n * (n + 1)) / 2.0) * (r / 100.0) * 1.0/12.0;
    }
    private double inputRecurringDeposit() {
        System.out.print("Enter the principal amount: ");
        double P = reader.nextDouble();
        System.out.print("Enter the time period in months: ");
        double n = reader.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double r = reader.nextDouble();
        return calculateRecurringDeposit(P, n, r);
    }
    private double inputTermDeposit() {
        System.out.print("Enter the principal amount: ");
        double P = reader.nextDouble();
        System.out.print("Enter the time period in years: ");
        double n = reader.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double r = reader.nextDouble();
        return calculateTermDeposit(P, n, r);
    }
    public static void main() {
        P8 obj = new P8();
        System.out.println("Choose the type of deposit you want to make: ");
        System.out.println("(1) for Term Deposit");
        System.out.println("(2) for Recurring Deposit");
        System.out.print("\nEnter your choice: ");
        int choice = obj.reader.nextInt();
        double mv = 0;
        switch (choice) {
            case 1:
                mv = obj.inputTermDeposit();
                break;
            case 2:
                mv = obj.inputRecurringDeposit();
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }
        System.out.println("The maturity value is: " + mv);
    }
}
