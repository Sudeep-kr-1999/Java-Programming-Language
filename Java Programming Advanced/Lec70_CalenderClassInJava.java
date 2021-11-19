import java.util.Calendar;
import java.util.TimeZone;

public class Lec70_CalenderClassInJava {
    public static void main(String[] args) {
        System.out.println("This is about calender class in java programming");
        System.out.println(
                "The Calender Class is an Abstract class in java programming------> very very important note to remember");

        // =========================================================================================================================================================================
        // --------------------------------------------------------------------------------------------------------------------------------------------
        // Calendar c= Calendar.getInstance();
        // System.out.println("The type of the Calender here is :
        // "+c.getCalendarType());
        // the output of the above code is below:--------------
        // The type of the Calender here is : gregory

        // this grogory is the type of the calender which is gregorian
        // calender...............!

        // --------------------------------------------------------------------------------------------------------------------------------------------
        // System.out.println("The timezone here is : "+c.getTimeZone());
        // output of the code is given below :------------------------------------
        // The timezone here is :
        // sun.util.calendar.ZoneInfo[id="Asia/Calcutta",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null]

        // --------------------------------------------------------------------------------------------------------------------------------------------
        // System.out.println("The Id of the TimeZone here is :
        // "+c.getTimeZone().getID());
        // output of the code given below :-----------------------
        // Asia/Calcutta

        // --------------------------------------------------------------------------------------------------------------------------------------------

        // =============================================================================================================================================================================
        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c1.getCalendarType());
        System.out.println(c1.getTimeZone());
        System.out.println(c1.getTimeZone().getID());
    }
}