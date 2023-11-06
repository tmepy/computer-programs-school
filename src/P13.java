public class P13 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 'A'; j <= 'E' - i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }
}
