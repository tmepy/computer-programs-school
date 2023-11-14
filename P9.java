public class P9 {
    private void S1() {
        System.out.println("Series 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print((int) Math.pow(i, 2));
            decideComma(i);
        }
    }
    private void S2() {
        System.out.println("\nSeries 2");
        int sum = 1;
        for (int i = 1; i <= 10; sum += i, i++) {
            System.out.print(sum);
            decideComma(i);
        }
    }
    private void S3() {
        System.out.println("\nSeries 3");
        for (int i = 1; i <= 10; i++) {
            System.out.print((int) Math.pow(i, 3) - 1);
            decideComma(i);
        }
    }
    private void S4() {
        int start = 24;
        int diff = 75;
        System.out.println("\nSeries 4");
        for (int i = 1; i <= 10; i++, start += diff, diff += 50) {
            System.out.print(start);
            decideComma(i);
        }
    }
    private void decideComma(int i) {
        if (i < 10) System.out.print(", ");
    }
    public static void main() {
        P9 obj = new P9();
        obj.S1();
        obj.S2();
        obj.S3();
        obj.S4();
    }
}
