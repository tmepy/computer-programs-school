import java.util.Scanner;

public class P7 {
    double amount, length, discount;
    private double getDealerDiscount() {
        if (length <= 10) discount = 10.0;
        else if (length <= 20) discount = 15.0;
        else discount = 20.0;
        return amount - (discount/100.0) * amount;
    }
    private double getRetailerDiscount() {
        if (length <= 10) discount = 8.0;
        else if (length <= 20) discount = 10.0;
        else discount = 15.0;
        return amount - (discount/100.0) * amount;
    }
    public static void main() {
        double after_discount = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the length of cloth: ");
        P7 obj = new P7();
        obj.length = reader.nextDouble();
        System.out.print("Enter the amount: ");
        obj.amount = reader.nextDouble();
        System.out.println("Enter type of customer.");
        System.out.println("(D) for Dealer");
        System.out.println("(R) Retailer");
        char choice = Character.toUpperCase(reader.next().charAt(0));
        switch (choice) {
            case 'D':
                after_discount = obj.getDealerDiscount();
                break;
            case 'R':
                after_discount = obj.getRetailerDiscount();
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }
        System.out.println("The length of paper rolls = " + obj.length);
        System.out.println("The amount to be paid = " + obj.amount);
        System.out.println("Discount = " + (int) obj.discount + "%");
        System.out.println("The amount after discount = ₹" + after_discount);
    }
}
