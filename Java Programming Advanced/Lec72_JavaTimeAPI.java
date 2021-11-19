import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Lec72_JavaTimeAPI {
    public static void main(String[] args) {
        System.out.println("this is about java.time API in java programming language");

        // date objects here are generally immutable
        LocalDate d= LocalDate.now();
        System.out.println(d);

        LocalTime t=LocalTime.now();
        System.out.println(t);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
    }
}
