public class Lec23_VariableArgumentInJava {
    // static int sum(int a, int b) {
    // return a + b;
    // }

    // static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // static int sum(int a, int b, int c, int d) {
    // return a + b + c + d;
    // }

    // VarArgs method (...) triple dot is used as varargs it is as same as (*args)
    // in python programming (very very important)!!!!!!

    // in this method there is no restriction that we have to give argument we may
    // pass it or not........!!!!!!!!
    // static int sum(int ...arr){
    // // available as int [] arr;
    // int result=0;
    // for(int ele:arr){
    // result+=ele;
    // }
    // return result;
    // }

    // it this method we are restricted that we must have to give one argument to
    // made this function work fine
    static int sum(int x, int... arr) {
        // available as int [] arr;
        int result = x;
        for (int ele : arr) {
            result += ele;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Variable arguments(VarArgs) in java programming");
        System.out.printf("The sum is %d\n", sum(5));
        System.out.printf("The sum of 4 and 5 is %d\n", sum(4, 5));
        System.out.printf("The sum of 4 , 5 and 6 is %d\n", sum(4, 5, 6));
        System.out.printf("The sum of2, 4 , 5 and 6 is %d\n", sum(2, 4, 5, 6));

        // agar hume bhut saare numbers ka sum calculate krna h to hum baar baar
        // function nhi bnaayege isme hum (VarArgs) concept k use krege.!

    }

}
