import java.util.Scanner;

public class MostFrequentChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] freq = new int[256]; // ASCII character frequencies

        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }

        char mostFrequent = input.charAt(0);
        int max = freq[mostFrequent];

        for (int i = 1; i < input.length(); i++) {
            if (freq[input.charAt(i)] > max) {
                max = freq[input.charAt(i)];
                mostFrequent = input.charAt(i);
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
