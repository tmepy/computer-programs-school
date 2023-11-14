import java.util.Scanner;

public class P32 {
    public static void main() {
        Scanner reader = new Scanner(System.in);
        String[] countries = {"China", "Jordan", "Brazil", "Peru", "Mexico", "Italy", "India"};
        String[] wonders = {"Great Wall of China", "Petra", "Christ the Redeemer", 
                        "Machu Picchu", "Chichen Itza", "Colosseum", "Taj Mahal"};
        System.out.print("Enter the name of the country you want to search for: ");
        String country_selected = reader.nextLine();
        for (int i = 0; i < countries.length; i++) {
            if (country_selected.trim().equalsIgnoreCase(countries[i])) {
                System.out.println(countries[i] + " - " + wonders[i]);
                System.exit(0);
            }
        }
        System.out.println("Sorry Not Found!");
    }
}
