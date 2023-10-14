import java.util.Locale;
import java.util.Scanner;
public class Balonder {
    public static void main(String[] args) {
        System.out.println("Balonder Award is a balloon filled with hydrogen or helium?");
        Scanner reader = new Scanner(System.in);
        String choice = reader.next();
        if (choice.toLowerCase(Locale.ROOT).equals("hydrogen"))
            System.out.println("Correct choice.");
        else System.out.println("Wrong choice. Correct answer is hydrogen.");
    }
}
