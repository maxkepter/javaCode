import java.util.Scanner;

public class sample {
    private static Scanner in = new Scanner(System.in);

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

    private static int sizeOfArray() {
        System.out.println("Enter number of array");
        int n = checkInputInt();
        return n;
    }

    private static int[] generateArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 100 + 1);
        }
        return a;
    }

    private static int searchValue() {
        System.out.println("Enter search value: ");
        int n = checkInputInt();
        return n;
    }
    // Collections.sort(newList, (Comment c1, Comment c2) ->
    // Integer.compare(c1.getLike(), c2.getLike()));
}