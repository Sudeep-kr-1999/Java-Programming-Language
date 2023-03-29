public class Lec22_MethodsOverloadingInJava {
    // static void telljoke() {
    // System.out.println("I invented a new word \nPlagiarism!");
    // }

    // static void change(int a) {
    // a = 66;

    // }

    // // in case of array reference get passed....................!
    // static void change2(int[] arr) {
    // arr[0] = 98;

    // }

    static void foo() {
        System.out.println("Good morning bro!");
    }

    static void foo(int a) {
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(float b) {
        System.out.println("Good morning " + b + " bro again!");
    }

    public static void main(String[] args) {
        // System.out.println("Methods overloading in java programming");
        // // telljoke();
        // int[] marks = { 52, 73, 77, 89, 98, 94 };

        // // changing the integer...!
        // // int x=45;
        // // change(x);
        // // System.out.printf("The value of x after running change is %d",x);

        // // changing the array
        // change2(marks);
        // System.out.printf("the changed value of marks[0] is %d", marks[0]);

        // METHODS OVERLOADING.....................!!!!!!!!!!!!!!!!!
        foo();
        foo(3000);
        foo(300.52f);
        // arguments are those which we paas to function while function calling and
        // arguments are actual!
        // parameters are those which is defined in the funciton while making it(
        // formal)

        // Note:--------> we cannot do method overloading by changing the return type, we
        // must have to change the parameters.....!

    }

}
