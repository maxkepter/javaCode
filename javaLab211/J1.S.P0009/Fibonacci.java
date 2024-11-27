public class Fibonacci {
    public static int fibonacci(int term, int higher, int lower) {
        if (term < 2) {
            return higher;
        }
        System.out.print(higher + ", ");
        return fibonacci(term - 1, higher + lower, higher);
    }

    public static void main(String[] args) {
        System.out.println("The 45 sequence fibonacci: ");
        fibonacci(45, 1, 0);
    }
}