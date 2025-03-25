import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = sc.nextInt();

        if (terms <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            System.out.println("Fibonacci sequence up to " + terms + " terms:");
            generateFibonacci(terms);
        }
    }

    static void generateFibonacci(int terms) {
        int first = 0, second = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
