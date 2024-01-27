package TruckAndContainers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {
    public static void main(String[] args) {
        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));
    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);
        StringBuilder textBuilder = new StringBuilder();
        int i = 0;

        while (birthday.isBefore(now) || birthday.isEqual(now)) {
            textBuilder.append(i++).append(" - ").append(formatter.format(birthday)).append(System.lineSeparator());
            birthday = birthday.plusYears(1);
        }
        return textBuilder.toString();
    }
}
