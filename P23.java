import java.util.Scanner;

public class P23 {
    double volume(double r) {
        return 4.0/3.0 * 22.0/7.0 * Math.pow(r, 3);
    }
    double volume(double l, double b, double h) {
        return l * b * h;
    }
    double volume(double r, double h) {
        return 22.0/7.0 * Math.pow(r, 2) * h;
    }
    public static void main() {
        Scanner reader = new Scanner(System.in);
        P23 obj = new P23();
        System.out.println("(1) Volume of a sphere");
        System.out.println("(2) Volume of a cuboid");
        System.out.println("(3) Volume of a cylinder");
        System.out.print("Choose an option: ");
        int option = reader.nextInt();
        switch (option) {
            case 1:
                System.out.print("Enter the radius of the sphere: ");
                double r = reader.nextDouble();
                System.out.println("Volume of the sphere: " + obj.volume(r));
                break;
            case 2:
                System.out.print("Enter the length of the cuboid: ");
                double l = reader.nextDouble();
                System.out.print("Enter the breadth of the cuboid: ");
                double b = reader.nextDouble();
                System.out.print("Enter the height of the cuboid: ");
                double h = reader.nextDouble();
                System.out.println("Volume of the cuboid: " + obj.volume(l, b, h));
                break;
            case 3:
                System.out.print("Enter the radius of the cylinder: ");
                double radius = reader.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double height = reader.nextDouble();
                System.out.println("Volume of the cylinder: " + obj.volume(radius, height));
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
