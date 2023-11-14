import java.util.Scanner;

// P19 renamed to Bill
public class Bill {
    int bno, call;
    String name;
    double amt;
    Bill() {
        bno = 0;
        call = 0;
        name = "";
        amt = 0.0;
    }
    Bill(int bno, int call, String name) {
        this.bno = bno;
        this.call = call;
        this.name = name;
    }
    void calculate() {
        final int rental_charge = 125;
        if (call <=100) amt = 0.60 * call;
        else if (call <= 200) amt = 0.60 * 100 + 0.80 * (call - 100);
        else if (call <= 300) amt = 0.60 * 100 + 0.80 * 100 + 1.20 * (call - 200);
        else amt = 0.60 * 100 + 0.80 * 100 + 1.20 * 100 + 2.00 * (call - 300);
        amt += rental_charge;
    }
    void display() {
        System.out.println("\nBill number: " + bno);
        System.out.println("Name of the customer: " + name);
        System.out.println("Number of calls: " + call);
        System.out.println("Amount to be paid: Rs. " + amt);
    }

    public static void main() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the bill number: ");
        int bno = reader.nextInt();
        System.out.print("Enter the number of calls: ");
        int call = reader.nextInt();
        System.out.print("Enter the name of the customer: ");
        String name = reader.next();
        Bill obj = new Bill(bno, call, name);
        obj.calculate();
        obj.display();
    }
}
