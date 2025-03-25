import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-mm-dd): ");
        String inputDate = sc.nextLine();

        LocalDate date = LocalDate.parse(inputDate);

        LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = addedDate.minusWeeks(3);

        System.out.println("Original Date       : " + date);
        System.out.println("After Adding        : " + addedDate);
        System.out.println("After Subtracting 3 Weeks: " + finalDate);
    }
}
