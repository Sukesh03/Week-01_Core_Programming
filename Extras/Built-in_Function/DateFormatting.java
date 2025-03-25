import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        String format1 = formatDate(currentDate, "dd/MM/yyyy");
        String format2 = formatDate(currentDate, "yyyy-MM-dd");
        String format3 = formatDate(currentDate, "EEE, MMM dd, yyyy");

        System.out.println("Format 1: " + format1);
        System.out.println("Format 2: " + format2);
        System.out.println("Format 3: " + format3);
    }

    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
