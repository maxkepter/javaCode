package P51;

public class Main {
    public static void menu() {
        while (true) {

            System.out.println("===== Calculator progarm =====");
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");
            int choice = Manager.checkInputInt();
            switch (choice) {
                case 1 -> Manager.normalCalculator();
                case 2 -> Manager.bmiCalculator();
                case 3 -> {
                    return;
                }
                default -> throw new AssertionError();
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
