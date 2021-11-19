public class Lec17_BreakAndContinueStatementInJava {
    public static void main(String[] args) {
        // System.out.println("Break and Continue statement in java programming");
        // break and continue using loops statements

        // break:-----> it is used to exit the loop irrespective of whether the
        // condition is true or false

        // for (int i = 0; i < 5; i++) {
        // System.out.println("Java is great!");
        // System.out.println(i);
        // if (i == 2) {
        // System.out.println("Ending the loop");
        // break;
        // }
        // }
        // System.out.println("Loop ends here");

        // = = = = = = = = = == = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = = = = = = = = = = = = = =
        // int i = 0;
        // while (i < 5) {
        // System.out.println("Java is great!");
        // System.out.println(i);
        // if (i == 2) {
        // System.out.println("Ending the loop");
        // break;
        // }
        // i++;
        // }

        // = = = = = = = = = == = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = = = = = = = = = = = = = =

        // do {
        // System.out.println("Java is great!");
        // System.out.println(i);
        // if (i == 2) {
        // System.out.println("Ending the loop");
        // break;
        // }
        // i++;
        // } while (i < 5);

        // = = = = = = = = = == = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = = = = = = = = = = = = = =

        // continue:-----------> jha continue aayega wha ke neeche ki statement execute
        // nhi hogi wo direct next iteration ke liye jaayega....!
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println("Java is great!");
            System.out.println(i);
        }

        System.out.println("Loop ends here");

    }

    // same hum saare continue ko saare loop mein run kr skte h

}
