
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ManageEastAsiaCountries {
    List<EastAsiaCountries> list = new ArrayList<>();
    private static final Scanner in = new Scanner(System.in);

    private static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input enter again: ");
            }
        }
    }

    public ManageEastAsiaCountries() {
    }

    private static float checkInputFloat() {
        while (true) {
            try {
                float result = Float.parseFloat(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input enter again: ");
            }
        }
    }

    public void enterInfo() {
        System.out.println("Enter number of countries");
        int num = checkInputInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter country code");
            String countryCode = in.nextLine();
            System.out.println("Enter country name");
            String countryName = in.nextLine();
            System.out.println("Enter area of country");
            float area = checkInputFloat();
            System.out.println("Enter country terrain");
            String countryTerrian = in.nextLine();
            list.add(new EastAsiaCountries(countryCode, countryName, area, countryTerrian));

        }
    }

    public void displayInfo() {
        if (list.isEmpty()) {
            System.out.println("There is no country in list");
        } else {
            for (EastAsiaCountries e : list) {
                e.display();
            }
        }
    }

    public void searchCountry() {
        System.out.println("Enter country name: ");
        String name = in.nextLine();
        boolean haveName = false;
        for (EastAsiaCountries c : list) {
            if (name.equalsIgnoreCase(c.getCountryName())) {
                c.display();
                haveName = true;
            }
        }
        if (!haveName) {
            System.out.println("There is no country with that name");
        }

    }

    public void sortCountryName() {
        if (list.isEmpty()) {
            System.out.println("There is no country in list");
        } else {
            list.sort(Comparator.comparing(list -> list.countryName.toLowerCase()));
            for (EastAsiaCountries c : list) {
                c.display();
            }
        }

    }
}
