import java.util.Scanner;

public class P24 {
    public static void main() {
        Scanner reader = new Scanner(System.in);
        int[] M = new int[6];
        int[] N = new int[4];
        int[] P = new int[M.length + N.length];
        
        System.out.println("Enter the values for array M: ");
        for (int i = 0; i < M.length; i++) M[i] = reader.nextInt();
        
        System.out.println("Enter the values for array N: ");
        for (int i = 0; i < N.length; i++) N[i] = reader.nextInt();

        for (int i = 0; i < M.length; i++) {
            P[i] = M[i];
        }
        for (int i = 0; i < N.length; i++) {
            P[M.length + i] = N[i];
        }
        
        System.out.println("Values of merged array P: ");
        for (int i: P) System.out.print(i + " ");
    }
}
