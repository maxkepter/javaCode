import java.util.Scanner;

public class MergeSort {
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

    public static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);
            merge(a, l, mid, r);
        }
    }

    private static void merge(int[] a, int l, int mid, int r) {
        int[] leftArr = new int[mid - l + 1];
        int[] rightArr = new int[r - mid];
        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = a[l + i];
        }
        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = a[mid + i + 1];
        }
        int i = 0, j = 0, k = l;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                a[k] = leftArr[i];
                k++;
                i++;
            } else {
                a[k] = rightArr[j];
                k++;
                j++;
            }
        }
        while (i < leftArr.length) {
            a[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightArr.length) {
            a[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number of array");
        int numArr = checkInputInt();
        int[] arr = generateArray(numArr);
        System.out.print("Unsorted array: [");
        displayArray(arr);
        System.out.println("]");
        mergeSort(arr, 0, arr.length - 1);
        System.out.print("Sorted array: [");
        displayArray(arr);
        System.out.println("]");
    }

}