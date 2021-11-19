// import java.util.Scanner;

public class Lec55_HandlingSpecificExceptionInJavaProgramming {
    public static void main(String[] args) {
        System.out.println("handling specific exception in java programming");
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        // Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index : ");
        // int ind = sc.nextInt();
        System.out.print("enter the number you want to divide the value with  : ");
        // int number = sc.nextInt();
        try {
            // System.out.println("the value at array index entered is : " + marks[ind]);
            // System.out.println("the value of array-value/number is : " + marks[ind] / number);
        } catch (ArithmeticException e1) {
            System.out.println("some ArithmeticException occoured");
            System.out.println(e1);
        }

        catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("some ArrayIndexOutOfBoundsException occoured");
            System.out.println(e2);
        } catch (Exception e3) {
            System.out.println("some other exception occoured");
            System.out.println(e3);
        }
    }

    // note:----------- exception order mein chlta h jis trah se code mein specify
    // hoga waisi hi 1 by 1 handle krega..................!!!!

    // note:----------- uncomment the code while running.............!!!!!!!!!!!!!!!!!!
}
