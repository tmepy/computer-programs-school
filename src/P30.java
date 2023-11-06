import java.util.Scanner;

public class P30 {
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
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] X = new int[10];
        for (int i = 0; i < X.length; i++) X[i] = reader.nextInt();
        System.out.println("The elements in the array: ");
        for (int i: X) System.out.print(i + " ");
        P30 obj = new P30();
        obj.BubbleSort(X);
        System.out.println("\n\nThe elements in the sorted array: ");
        for (int i: X) System.out.print(i + " ");
    }
}
