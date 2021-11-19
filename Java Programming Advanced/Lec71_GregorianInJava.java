import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
public class Lec71_GregorianInJava {
    public static void main(String[] args) {
        System.out.println("This is about Gregorian Calender Class In Java");
        Calendar c= Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+" : "+c.get(Calendar.MINUTE)+" : "+c.get(Calendar.SECOND));
        GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.isLeapYear(2020));
        System.out.println(cal.isLeapYear(2018));
        // =====================================================================================================================================================
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);

        // note:-------- we can use forloops for getting all the timezone available in java programming
    }
}