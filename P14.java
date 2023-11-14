public class P14 {
    public static void main() {
        int num = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) System.out.print(num + " ");
            System.out.println();
            num--;
        }
    }
}
