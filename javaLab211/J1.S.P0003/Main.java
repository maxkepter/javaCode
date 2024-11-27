import java.util.Scanner;

public class Main {
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
        return a;
    }

    private static void displayArray(int[] arr) {
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(", " + arr[i]);
        }
    }

    private static void insertionSort(int[] arr) {
        System.out.print("Unsorted array: [");
        displayArray(arr);
        System.out.println("]");
        for (int i = 1; i < arr.length; i++) {
            int tempIndex = i;
            while (arr[tempIndex] < arr[tempIndex - 1]) {

                int temp = arr[tempIndex];
                arr[tempIndex] = arr[tempIndex - 1];
                arr[tempIndex - 1] = temp;
                tempIndex--;
                if (tempIndex < 1) {
                    break;
                }
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number of array");
        int numArr = checkInputInt();
        int[] arr = generateArray(numArr);
        insertionSort(arr);
        System.out.print("Sorted array: [");

        displayArray(arr);
        System.out.println("]");
    }
}