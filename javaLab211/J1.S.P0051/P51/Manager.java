package P51;

import java.util.Scanner;

public class Manager {
    private static final Scanner in = new Scanner(System.in);

    private static final String OPERATORS = "+-*/^=";

    private static char checkInputOperator() {
        while (true) {
            try {
                System.out.print("Enter an operator (+, -, *, /, ^): ");
                String res = in.nextLine().trim();
                if (res.length() == 1 && OPERATORS.indexOf(res.charAt(0)) != -1) {
                    return res.charAt(0);
                } else {
                    throw new IllegalArgumentException("Invalid operator. Please try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input enter again: ");
            }
        }
    }

    private static double checkInputDoubleBMI(String alter) {
        while (true) {
            try {
                System.out.print(alter);
                double result = Double.parseDouble(in.nextLine().trim());
                if (result < 1) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("BMI is digit");
            }
        }
    }

    private static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine().trim());

                return result;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input enter again: ");
            }
        }
    }

    public static void normalCalculator() {
        System.out.println("---- Normal calculator -----");
        System.out.print("Enter number ");
        double memory = checkInputDouble();
        char operator = checkInputOperator();
        while (operator != '=') {
            switch (operator) {
                case '+' -> {
                    memory += checkInputDouble();
                    System.out.println("Memory: " + memory);
                    operator = checkInputOperator();
                }
                case '-' -> {
                    memory -= checkInputDouble();
                    System.out.println("Memory: " + memory);
                    operator = checkInputOperator();
                }
                case '*' -> {
                    memory *= checkInputDouble();
                    System.out.println("Memory: " + memory);
                    operator = checkInputOperator();
                }
                case '/' -> {
                    double temp = checkInputDouble();
                    while (temp == 0) {
                        System.out.println("Can not divided by 0");
                        temp = checkInputDouble();
                    }
                    memory /= temp;
                    System.out.println("Memory: " + memory);
                    operator = checkInputOperator();
                }
                case '^' -> {
                    double power = checkInputDouble();
                    memory = Math.pow(memory, power);
                    System.out.println("Memory: " + memory);
                    operator = checkInputOperator();
                }
                default -> {
                }
            }

        }
        System.out.println("Result: " + memory);
    }

    public static void bmiCalculator() {
        System.out.println("---- BMI Calculator ----");
        double weight = checkInputDoubleBMI("Enter Weight(kg): ");
        double height = checkInputDoubleBMI("Enter height(cm):");
        double bmi = weight / (Math.pow(height, 2));
        if (bmi < 19) {
            System.out.println("BMI status: Under-standard");
        } else if (bmi < 25) {
            System.out.println("BMI status: Standard");
        } else if (bmi < 30) {
            System.out.println("BMI status: Overweight");
        } else if (bmi < 40) {
            System.out.println("BMI status: Fat - should lose weight");
        } else {
            System.out.println("BMI status: Very fat - should lose weight immediately");
        }
    }
}
