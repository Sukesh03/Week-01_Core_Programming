import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("The computer will try to guess it.");
        System.out.println("Enter 'high' if the guess is too high, 'low' if it's too low, and 'correct' if the guess is right.");

        while (!guessedCorrectly && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "?");
            String feedback = getUserFeedback(sc);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("The computer guessed your number correctly.");
                guessedCorrectly = true;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Unable to guess the number within the valid range. Please ensure responses are consistent.");
        }
    }

    static int generateGuess(int low, int high) {
        return low + (int)(Math.random() * (high - low + 1));
    }

    static String getUserFeedback(Scanner sc) {
        System.out.print("Your response (high/low/correct): ");
        return sc.nextLine().trim();
    }
}
