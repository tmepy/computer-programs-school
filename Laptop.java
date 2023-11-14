import java.util.Scanner;

// P20 renamed to Laptop
public class Laptop {
    String name;
    int price;
    double dis, amt;
    Laptop(String name, int price) {
        this.name = name;
        this.price = price;
    }
    void compute() {
        if (price <= 25000) dis = 5.0;
        else if (price <= 50000) dis = 7.5;
        else if (price <= 100000) dis = 10.0;
        else dis = 15.0;

        amt = price - price * dis / 100;
    }
    void display() {
        System.out.println("\nName of the customer: " + name);
        System.out.println("Price of the laptop: Rs. " + price);
        System.out.println("Discount: " + dis + "%");
        System.out.println("Amount to be paid: Rs. " + amt);
    }

    public static void main() {
        System.out.print("Enter your name: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.next();
        System.out.print("Enter the price of the laptop: ");
        int price = reader.nextInt();
        Laptop obj = new Laptop(name, price);
        obj.compute();
        obj.display();
    }
}
