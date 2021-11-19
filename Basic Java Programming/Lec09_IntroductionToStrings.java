
// import java.util.Scanner;

public class Lec09_IntroductionToStrings {
    public static void main(String[] args) {
        // System.out.println("Introduction to Strings");
        // String name=new String("Sudeep");
        // String name="Sudeep";
        // note:--------> Strings are Immutable in java programming language
        // System.out.print("The name is :");
        // System.out.println(name);

        // %d ,%f and all like these is format specifiers
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and the value of b is %f\n", a, b);
        System.out.format("The value of a is %d and the value of b is %f\n", a, b);
        System.out.format("The value of a is %d and the value of b is %.2f\n", a, b); // it will show only 2 digit after
                                                                                      // the decimal
        System.out.format("The value of a is %d and the value of b is %8.2f\n", a, b);
        // here "%8.2f" means total value print krne mein 8 spaces lega aur 2 digit
        // decimal ke baad hoga bs.......!
        // overall value total 8 spaces ki hi hogi (very very
        // important)..................

        // Scanner sc = new Scanner(System.in);
        // String st = sc.nextLine();
        // System.out.println(st);

    }
}
