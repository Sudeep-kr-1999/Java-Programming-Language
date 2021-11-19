public class Lec07_AssociativityInJava {
    public static void main(String[] args) {
        System.out.println("Associativity and precedence in java programming");
        int a=6*5-34/2;
        /*
        =30-34/2
        =30-17
        =13
        */

        int b=60/5-34*2;
        /*
        =12-34*2
        =12-68
        = -56
        */

        // note:------- precedence of "*" and "/" is same so we look for the Associativity and Associativity of "*" and "/" is left to right..!
                        // means jo pehle left mein aayega wo pehle evaluate hoga.........
        System.out.println(b);
        System.out.println(a);

    }
}
