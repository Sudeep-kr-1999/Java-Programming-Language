import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lec73_DateTimeFormatterInJava {
    public static void main(String[] args) {
        System.out.println("This is about datetime formatter in java programming");
        LocalDateTime dt= LocalDateTime.now();   // this is the date
        System.out.println(dt);

        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy --E a");  // this is the datetime formatter
        DateTimeFormatter df1= DateTimeFormatter.ISO_LOCAL_DATE;
        // System.out.println(df);
        String mydate=dt.format(df); //this is the formatted date
        String mydate1=dt.format(df1);

        System.out.println(mydate);
        System.out.println(mydate1);

        // note:-------- as per the need we can refer to the documentation of the java language
    }
}
