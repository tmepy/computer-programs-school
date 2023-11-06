import java.util.Scanner;

public class P28 {
    private void BubbleSort(int[] X) {
        int length = X.length, temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (X[j + 1] < X[j]) {
                    temp = X[j + 1];
                    X[j + 1] = X[j];
                    X[j] = temp;
                }
            }
        }
    }
    private boolean BinarySearch(int[] X, int num) {
        int middle, start = 0, end = X.length - 1;
        boolean found = false;
        while (start <= end) {
            middle = (start+end)/2;
            if (X[middle] == num) {
                found = true;
                break;
            }
            else if (X[middle] < num) start = middle + 1;
            else end = middle - 1;
        }
        return found;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter years of graduation.");
        int[] X = new int[10];
        for (int i = 0; i < X.length; i++) X[i] = reader.nextInt();
        P28 obj = new P28();
        obj.BubbleSort(X);
        System.out.println("The years of graduation in ascending order: ");
        for (int i: X) System.out.print(i + " ");
        System.out.println("\n\nEnter the year to be searched: ");
        int year = reader.nextInt();
        boolean found = obj.BinarySearch(X, year);
        if (found) System.out.println("Record Exists.");
        else System.out.println("Record does not exist.");
    }
}
