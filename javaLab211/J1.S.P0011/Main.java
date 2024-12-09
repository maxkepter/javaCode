import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== Converter Program =====");
            System.out.println("1. Binary to other bases");
            System.out.println("2. Decimal to other bases");
            System.out.println("3. Hexadecimal to other bases");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = ValidateInput.checkIntputRange(1, 4);

            switch (choice) {
                case 1:
                    manager.binaryConvert();
                    break;
                case 2:
                    manager.decimalConvert();
                    break;
                case 3:
                    manager.hexaConvert();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
