import java.util.Scanner;

public class ValidateInput {

    private static final Scanner in = new Scanner(System.in);
    private static final String BINARY_VALID = "[0-1]+"; // Chỉ chấp nhận chuỗi chỉ chứa 0 và 1
    private static final String DECIMAL_VALID = "[0-9]+"; // Chỉ chấp nhận số thập phân (chuỗi chữ số)
    private static final String HEXADECIMAL_VALID = "[0-9A-F]+"; // Chỉ chấp nhận ký tự hợp lệ trong hệ 16 (0-9, A-F)

    // Kiểm tra nhập số nguyên trong khoảng min-max
    public static int checkIntputRange(int min, int max) {
        while (true) {
            try {
                System.out.print("Enter a number in range [" + min + "-" + max + "]: ");
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number in the range [" + min + "-" + max + "].");
            }
        }
    }

    // Kiểm tra nhập Binary hợp lệ
    public static String checkInputBianry() {
        while (true) {
            System.out.print("Enter binary value: ");
            String result = in.nextLine().trim();
            if (result.matches(BINARY_VALID)) {
                return result;
            } else {
                System.out.println("Invalid binary input. Please enter only 0s and 1s.");
            }
        }
    }

    // Kiểm tra nhập Decimal hợp lệ
    public static String checkInputDecimal() {
        while (true) {
            System.out.print("Enter decimal value: ");
            String result = in.nextLine().trim();
            if (result.matches(DECIMAL_VALID)) {
                return result;
            } else {
                System.out.println("Invalid decimal input. Please enter a valid decimal number.");
            }
        }
    }

    // Kiểm tra nhập Hexadecimal hợp lệ
    public static String checkInputHexa() {
        while (true) {
            System.out.print("Enter hexadecimal value: ");
            String result = in.nextLine().trim();
            if (result.matches(HEXADECIMAL_VALID)) {
                return result.toUpperCase(); // Đảm bảo chuyển tất cả ký tự sang chữ hoa
            } else {
                System.out.println("Invalid hexadecimal input. Please enter only characters [0-9, A-F].");
            }
        }
    }
}
