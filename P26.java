import java.util.Scanner;

public class P26 {
    public static void main() {
        Scanner reader = new Scanner(System.in);
        double[] x = new double[15];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < x.length; i++) {
            x[i] = reader.nextDouble();
        }
        System.out.println("The elements in the array: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
            if (i != x.length - 1) System.out.print(", ");
        }
        double largest = x[0], smallest = x[0];
        for (double num : x) {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }
        System.out.println("\nLargest element: " + largest + "\nSmallest element: " + smallest);
        System.out.println("Range: " + (largest - smallest));
    }
}
