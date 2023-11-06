import java.util.Scanner;

public class P27 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] x = new int[10];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < x.length; i++) x[i] = reader.nextInt();
        System.out.println("The elements in the array: ");
        for (int j : x) System.out.print(j + " ");
        System.out.print("\nEnter the element to be searched: ");
        int element = reader.nextInt();
        boolean found = false;
        int index = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == element) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("Search Successful." + element + " found at position " + (index + 1) + ".");
        }
        else {
            System.out.println(element + " not found in the list, search unsuccessful.");
        }
    }
}
