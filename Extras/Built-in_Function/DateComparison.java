import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-mm-dd): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());

        System.out.print("Enter second date (yyyy-mm-dd): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine());

        compareDates(date1, date2);
    }

    static void compareDates(LocalDate d1, LocalDate d2) {
        if (d1.isBefore(d2)) {
            System.out.println("The first date is before the second date.");
        } else if (d1.isAfter(d2)) {
            System.out.println("The first date is after the second date.");
        } else if (d1.isEqual(d2)) {
            System.out.println("Both dates are the same.");
        }
    }
}
