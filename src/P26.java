import java.util.Scanner;

public class P26 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[][] x = new int[15][15];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < 15; j++) x[i][j] = reader.nextInt();
        }
        System.out.println("The elements in the array: ");
        for (int[] ints : x) {
            for (int j = 0; j < 15; j++) System.out.print(ints[j] + " ");
            System.out.println();
        }
        int largest = x[0][0], smallest = x[0][0];
        for (int[] ints : x) {
            for (int j = 0; j < 15; j++) {
                if (ints[j] > largest) largest = ints[j];
                if (ints[j] < smallest) smallest = ints[j];
            }
        }
        System.out.println("\nLargest element: " + largest + "\nSmallest element: " + smallest);
        System.out.println("Range: " + (largest - smallest));
    }
}
