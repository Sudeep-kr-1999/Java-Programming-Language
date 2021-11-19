// import java.util.Scanner;

// class MyException extends Exception {
//     @Override
//     public String toString() {
//         // return super.toString() + " i am to string()";
//         return " i am to string()";
//     }

//     @Override
//     public String getMessage() {
//         // return super.getMessage() + " i am get message()";
//         return " i am get message()";
//     }

// }

// public class Lec57_TheExceptionClassInJava {
//     public static void main(String[] args) {
//         System.out.println("The exception class in java programming");
//         // Scanner sc = new Scanner(System.in);
//         // int a = sc.nextInt();
//         int a=6;
//         if (a < 99) {
//             try {
//                 // throw new MyException();
//                 throw new ArithmeticException("this is an exception");
//             } catch (Exception e) {
//                 System.out.println(e.getMessage());
//                 System.out.println(e.toString());
//                 System.out.println(e);
//                 e.printStackTrace();
//                 // note:-------- the output of e.printStackTrace(); is ( at
//                 // Lec57_TheExceptionClassInJava.main(Lec57_TheExceptionClassInJava.java:25))
//                 System.out.println("finished");
//                 // note:-------------- custom Exception bnane pr by default toString() method
//                 // run hota h...............!!!!!!!!
//             }
//             System.out.println("yes finished");
//         }

//         // note:------------------ throw keyword is used to throw an exception explicitly by a programmer..............!!!!!!!
//     }
// }


// note:=========== uncomment above code to execute file............!!!!!!!!!!!!!!!!
