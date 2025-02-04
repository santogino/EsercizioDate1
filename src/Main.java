import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String dateTimeFormatShort = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println("Date in format SHORT = " + dateTimeFormatShort);

        ZonedDateTime dateFull = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        String dateTimeFormatFull = dateFull.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        System.out.println("Date in format FULL = " + dateTimeFormatFull);

        String dateTimeFormatMedium = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("Date in format MEDIUM = " + dateTimeFormatMedium);

    }
}