import java.util.Date;

public class Lec69_DateClassInJava {
    public static void main(String[] args) {
        System.out.println("This is about Date class in java programming");
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());

        // note:--------- all the below methods are depricated.!!!!!!!!!!!!!
        // System.out.println(d.getDate());
        // System.out.println(d.getSeconds());
        // System.out.println(d.getYear());
        // System.out.println(d.getDay());
    }
}
// we can use java documentation for more use as per our
// need!:-------------------------------