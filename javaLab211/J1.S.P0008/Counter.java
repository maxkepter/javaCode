import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counter {
    static Map<String, Integer> words = new HashMap<>();
    static Map<Character, Integer> chars = new HashMap<>();

    private static void wordCounter(String str) {
        Scanner sc = new Scanner(str);
        while (sc.hasNext()) {
            String word = sc.next();
            words.put(word, words.getOrDefault(word, 0) + 1);
        }
        sc.close(); // Đóng Scanner
        System.out.println(words); // In kết quả Map trực tiếp
    }

    private static void charCounter(String str) {
        for (char ch : str.toCharArray()) {
            if (Character.isSpaceChar(ch))
                continue;
            chars.put(ch, chars.getOrDefault(ch, 0) + 1);
        }
        System.out.println(chars); // In kết quả Map trực tiếp
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your content:");
        String content = scanner.nextLine();
        scanner.close(); // Đóng Scanner

        System.out.println("Word Count:");
        wordCounter(content);

        System.out.println("Character Count:");
        charCounter(content);
    }
}
