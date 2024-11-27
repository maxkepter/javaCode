
import java.util.Scanner;

public class LinearSearch {
    private static Scanner in = new Scanner(System.in);

    private static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < 1) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input enter again: ");
            }
        }
    }

    private static int[] generateArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 100 + 1);
        }
        quickSort(a, 0, n - 1);
        return a;
    }

    private static void displayArray(int[] arr) {
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(", " + arr[i]);
        }
    }

    private static void quickSort(int[] arr, int l, int r) {
        int p = arr[(l + r) / 2];
        int i = l, j = r;
        while (i < j) {
            while (arr[i] < p) {
                i++;
            }
            while (arr[j] > p) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (i < r) {
            quickSort(arr, i, r);
        }
        if (j > l) {
            quickSort(arr, l, j);
        }

    }

    public static int linearSearch(int[] arr, int k, int r, int l) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Enter number array");
        int numArr = checkInputInt();
        System.out.println("Enter search value");
        int k = checkInputInt();
        int[] arr = generateArray(numArr);
        int index = linearSearch(arr, k, 0, arr.length - 1);
        if (index == -1) {
            System.out.println("Do not found " + k + " in array");
        } else {
            System.out.println("Found " + k + " at index " + index);
        }
    }
}