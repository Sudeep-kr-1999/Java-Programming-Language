public class Lec68_DateAndTimeInJava {
    public static void main(String[] args) {
        System.out.println("This is About Date and Time in java programming");
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

    }
}

// // date and time in java programming!----------------
// java.time:---> it is a package for date and time in java from java 8 onwards
// before java8 , java.util package used to hold the date and time classes now
// these classes are depricated....!!!

// how java store date ????
// date in java is stored in the form of a long number. this long number holds
// the number of milliseconds passed since 1 jan 1970.

// java assumes that 1900 is the start year which means it calculates years
// passed since 1900 whenever we ask it for years

// System.currentTimeMillis() return no. of milli-second passed...................!