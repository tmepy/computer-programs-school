import java.util.Scanner;

// P18 renamed to ParkingLot
public class ParkingLot {
    int vno, hours;
    double bill;
    void input() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the vehicle number: ");
        vno = reader.nextInt();
        System.out.print("Enter the number of hours: ");
        hours = reader.nextInt();
    }
    void calculate() {
        if (hours <= 1) bill = 3.00;
        else bill = 3.00 + (hours - 1) * 1.50;
    }
    void display() {
        System.out.println("\nVehicle number: " + vno);
        System.out.println("Number of hours: " + hours);
        System.out.println("Bill amount: Rs. " + bill);
    }

    public static void main() {
        ParkingLot obj = new ParkingLot();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
