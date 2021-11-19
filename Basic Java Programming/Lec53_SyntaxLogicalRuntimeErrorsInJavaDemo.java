public class Lec53_SyntaxLogicalRuntimeErrorsInJavaDemo {
    public static void main(String[] args) {
        System.out.println("This is demo about Syntax, Logical and Runtime Errors");
        // int a=5;
        // int b=9;
        int count = 0;
        // System.out.println(a + b);
        // write a program to print all prime numbers between 1 to
        // 10:---------------------
        // Logical error demo:--------------------------------

        // note:-------- 0 and 1 is not a prime
        // number............!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        // = = = = == = = = = = = = = = = = = = = = = = = = = = = = = = == == = = = == =
        // = = == = = = = = = = = = = = = == = ==
        // this is the correct logic:--------------------
        // if we use wrong logic then we are on logical error and the code should be
        // logical completely...............!!

        // agr hum soln mein general "n" ke liye soln nhi krege to ye logical error
        // hoga.............!
        // = = = = == = = = = = = = = = = = = = = = = = = = = = = = = = == == = = = == =
        // = = == = = = = = = = = = = = = == = ==

        // = = = = = == = = = = = = = = = = = = = = = = = = = = = = = == = = = = = = = =
        // = = = = = = = = = = = = = = = = = = = = = = == ==
        for (int i = 0; i <= 1000; i++) {
            if (i == 0) {
                // System.out.println("the number " + i + " is not prime number as per
                // definition");
                continue;
            }

            if (i == 1) {
                // System.out.println("the number " + i + " is not a prime number as per
                // difinition");
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = count + 1;
                    // System.out.println("The number " + i + " is not the prime number");
                    break;
                }
            }
            if (count == 0) {
                System.out.println("this number " + i + " is a prime number");
            }

            count = 0;
        }

        // = = = = = == = = = = = = = = = = = = = = = = = = = = = = = == = = = = = = = =
        // = = = = = = = = = = = = = = = = = = = = = = == ==

        // Runtime errors:--------------------
        // jb hum kuch aisa krte h jo allowed nhi h while programming is running like
        // (dividing some number by 0).....
        // it gives infinity and it is a arithematic error in java
        // programming(Exception)...!

    }

}
