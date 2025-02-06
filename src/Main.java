import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        System.out.println("Date in format SHORT = " + dateShort(dateTime));

        System.out.println("Date in format FULL = " + dateFull(dateTime));

        System.out.println("Date in format MEDIUM = " + dateMedium(dateTime));

    }

    public static String dateShort(OffsetDateTime date){
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        return date.format(formatter);
    }

    public static String dateMedium(OffsetDateTime date){
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String dateTimeFormatShort = date.format(formatter);
        return dateTimeFormatShort;
    }

    public static String dateFull(OffsetDateTime date){
        OffsetDateTime dateFull = OffsetDateTime.parse("2002-03-01T13:00:00Z").atZoneSameInstant(ZoneId.systemDefault()).toOffsetDateTime();
        String dateTimeFormatFull = dateFull.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        return dateTimeFormatFull;
    }
}