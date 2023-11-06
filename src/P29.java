import java.util.Scanner;

public class P29 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = reader.nextInt();
        String[] name = new String[n];
        int[] marks = new int[n];
        int total_marks = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            name[i] = reader.next();
            System.out.print("Enter the marks of student " + name[i] + ": ");
            marks[i] = reader.nextInt();
            total_marks += marks[i];
        }
        double average = total_marks/(double) n;
        System.out.println("The average marks of the class: " + average);
        for (int i = 0; i < n; i++) {
            System.out.println("Deviation of " + name[i] + " from average: " + (marks[i] - average));
        }
    }
}
