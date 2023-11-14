import java.util.Scanner;

// P17 renamed to ElectricBill
public class ElectricBill {
    String n;
    int units;
    double bill;
    void accept() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the name of the customer: ");
        n = reader.nextLine();
        System.out.print("Enter the number of units consumed: ");
        units = reader.nextInt();
    }
    void calculate() {
        if (units <= 100) bill = units * 2.00;
        else if (units <= 300) bill = 100 * 2.00 + (units - 100) * 3.00;
        else bill = 100 * 2.00 + 200 * 3.00 + (units - 300) * 5.00;

        if (units > 300) bill += bill * 0.025;
    }
    void print() {
        System.out.println("\nName of the customer: " + n);
        System.out.println("Number of units consumed: " + units);
        System.out.println("Bill amount: Rs. " + bill);
    }

    public static void main() {
        ElectricBill obj = new ElectricBill();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}
