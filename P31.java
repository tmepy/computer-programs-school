import java.util.Scanner;

public class P31 {
    private void BubbleSortString(String[] names) {
        String temp;
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - i -1; j++) {
                if (names[j + 1].compareTo(names[j]) < 0) {
                    temp = names[j + 1];
                    names[j + 1] = names[j];
                    names[j] = temp;
                }
            }
        }
    }
    private void decideComma(int i, int length) {
        if (i == length - 1) System.out.print(" and ");
        else if (i < length) System.out.print(", ");
        else System.out.println(".");
    }
    public static void main() {
        Scanner reader = new java.util.Scanner(System.in);
        String[] names = new String[10];
        P31 obj = new P31();
        System.out.println("Enter names of 10 students: ");
        for (int i = 0; i < names.length; i++) names[i] = reader.next();
        System.out.println("The names in the unsorted array: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            obj.decideComma(i, names.length - 1);
        }
        obj.BubbleSortString(names);
        System.out.println("\nThe names in the sorted array: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            obj.decideComma(i, names.length - 1);
        }
    }
}
