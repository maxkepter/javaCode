package P50;

import java.util.Scanner;

public class Manager {
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

    private static int checkInputIntExcep(int excep) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result == excep) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input enter again: ");
            }
        }
    }

    public static void menu() {

        while (true) {
            System.out.println("Enter your choice");
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            int choice = checkInputInt();
            switch (choice) {
                case 1 -> superlativeEquation();

                case 2 -> quadraticEquation();

                case 3 -> {
                    return;
                }

            }
        }
    }

    private static boolean isSquare(int n) {
        int a = (int) Math.sqrt(n);
        return a * a == n;
    }

    public static void superlativeEquation() {
        int[] coe = new int[2];
        System.out.println("Enter coeficients");
        System.out.print("a:");
        coe[0] = checkInputInt();
        System.out.print("b: ");
        coe[1] = checkInputInt();
        if (coe[0] == 0 && coe[1] == 0) {
            System.out.println("Equation have infinite solution");
        } else if (coe[0] == 0) {
            System.out.println("Equation does not have solution");
        } else {
            double res = -coe[1] / coe[0];
            System.out.println("x=" + res);
            for (int i = 0; i < 2; i++) {
                if (coe[i] % 2 == 0) {
                    System.out.println((char) ('a' + i) + " is even number");
                } else {
                    System.out.println((char) ('a' + i) + " is odd number");
                }
                if (isSquare(coe[i])) {
                    System.out.println((char) ('a' + i) + "is square number");
                }
            }
        }

    }

    public static void quadraticEquation() {
        int[] coe = new int[3];
        System.out.println("Enter coeficients");
        System.out.print("a:");
        coe[0] = checkInputIntExcep(0);
        System.out.print("b: ");
        coe[1] = checkInputInt();
        System.out.print("c: ");
        coe[2] = checkInputInt();
        int delta = (coe[1] * coe[1]) - 4 * coe[0] * coe[2];
        if (delta > 0) {
            System.out.println("Equation have two solution");
            double res1 = (-coe[1] + Math.sqrt(delta)) / 2 * coe[0];
            double res2 = (-coe[1] - Math.sqrt(delta)) / 2 * coe[0];
            System.out.println("x1 = " + res1);
            System.out.println("x2 = " + res2);

        } else if (delta == 0) {
            double res = (-coe[1] / (2 * coe[0]));
            System.out.println("Equation have only one solution");
            System.out.println("x = " + res);
        } else {
            System.out.println("Equation does not have solution");
        }
        for (int i = 0; i < 3; i++) {
            if (coe[i] % 2 == 0) {
                System.out.println((char) ('a' + i) + " is even number");
            } else {
                System.out.println((char) ('a' + i) + " is odd number");
            }
            if (isSquare(coe[i])) {
                System.out.println((char) ('a' + i) + "is square number");
            }
        }

    }
}
