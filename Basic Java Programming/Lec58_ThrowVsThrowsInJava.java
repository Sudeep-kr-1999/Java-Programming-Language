
// class NegativeRadiusException extends Exception {
//     @Override
//     public String toString() {
//         return "Radius cannot be negative!";
//     }
// }

// public class Lec58_ThrowVsThrowsInJava {
//     // made by harry.!

//     public static double area(double radius) throws NegativeRadiusException {
//         if (radius < 0) {
//             throw new NegativeRadiusException();
//         } else {
//             double result = Math.PI * radius * radius;
//             return result;
//         }
//     }

//     public static int divide(int a, int b) throws ArithmeticException {
//         int result = a / b;
//         return result;
//     }

//     public static void main(String[] args) {
//         System.out.println("this is about throw vs throws in exception in java programming");
//         // shivam--- uses divide function created by harry;
//         try {
//             int c = divide(6, 0);
//             System.out.println(c);
//         } catch (Exception e) {
//             System.out.println(e);
//         }

//         try {
//             double area = area(6);
//             System.out.println(area);
//         } catch (Exception e) {
//             System.out.println(e);
//         }

//     }
// }

// // note:---------- throws btata h ki koi exception throw ho skta h by the function(method).....................(very very important!)