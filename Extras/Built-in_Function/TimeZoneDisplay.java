import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneDisplay {

    public static void main(String[] args) {
        displayTimeInZone("GMT");
        displayTimeInZone("Asia/Kolkata"); // IST
        displayTimeInZone("America/Los_Angeles"); // PST
    }

    static void displayTimeInZone(String zone) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        System.out.println(zone + ": " + zonedDateTime.format(formatter));
    }
}
