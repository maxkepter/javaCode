
import java.util.Scanner;

public class P52 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ManageEastAsiaCountries asiaCountries = new ManageEastAsiaCountries();
        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1: Enter the information for country");
            System.out.println("2: Display information");
            System.out.println("3: Search country by name");
            System.out.println("4: Sort country by name");
            System.out.println("5: Exit");
            int choice = Integer.parseInt(s.nextLine().trim());
            switch (choice) {
                case 1 -> asiaCountries.enterInfo();
                case 2 -> asiaCountries.displayInfo();
                case 3 -> asiaCountries.searchCountry();
                case 4 -> asiaCountries.sortCountryName();
                case 5 -> {
                    return;
                }

                default -> throw new AssertionError();
            }
        }
    }
}
