import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main test = new Main();

    @Test
    void dateShort() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        String dateTimeFormatShort = dateTime.format(formatter);
        assertEquals("01/03/02, 13:00", dateTimeFormatShort);
    }

    @Test
    void dateMedium() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2024-02-06T13:00:00Z");
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String dateTimeFormatShort = dateTime.format(formatter);
        assertEquals("6 feb 2024, 13:00:00", dateTimeFormatShort);
    }

    @Test
    void dateFull() {
        OffsetDateTime dateFull = OffsetDateTime.parse("2025-02-06T13:00:00Z").atZoneSameInstant(ZoneId.systemDefault()).toOffsetDateTime();
        String dateTimeFormatFull = dateFull.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        assertEquals("giovedì 6 febbraio 2025", dateTimeFormatFull);
    }
}