import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate toDay = LocalDate.now();

        System.out.println(toDay);

        LocalDate currentDate = LocalDate.of(2021,10,5);
        System.out.println(currentDate);

        System.out.println(toDay.getDayOfMonth());
        System.out.println(toDay.getDayOfWeek());
        System.out.println(toDay.getDayOfYear());

        System.out.println(toDay.getMonth());
        System.out.println(toDay.getMonthValue());

        System.out.println(toDay.plusDays(1));
        System.out.println(toDay.plusYears(2));

        System.out.println(toDay.minusDays(3));

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime currentTime = LocalTime.of(12,30);
        System.out.println(currentTime);
        System.out.println(time.getHour());

        System.out.println(time.plusMinutes(30));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);


        String format = "dd/MM/yyyy";//mm là phút
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern(format);
        String rs = toDay.format(myFormatter);
        System.out.println(rs);
    }
}
