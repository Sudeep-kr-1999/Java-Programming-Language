// import java.util.Scanner;

// public class Lec05_TakingUserInputInJava {
// public static void main(String[] args) {
// System.out.println("Taking user input in java programming");
// // Scanner sc = new Scanner(System.in);
// // System.out.println("Enter number 1 : ");
// // float a=sc.nextFloat();
// // boolean b1 = sc.hasNextInt();
// // System.out.println(b1);
// // System.out.println("Enter number 2 :");
// // int b=sc.nextInt();
// // float b=sc.nextFloat();
// // float sum=a+b;
// // System.out.println("The sum of the numbers is");
// // System.out.println(sum);

// // String str=sc.next();

// // // note:-----------> first space ke baad waale entry ko read nhi krega
// agar
// // string mein spaces bhi included h to.......!!
// // System.out.println(str);

// // String str = sc.nextLine();
// // // for reading complete string with spaces..................!!!!!!!!!
// // System.out.println(str);

// // }
// // }

//





// -------------------------- - - -
// ---------------------------------------------------------------------------------------------------
// other way of giving input with the help of String args[] ye String args[]
// khud ke index mein runtime mein pass kiye huye value ko rkh lga
// with the help of wrapper class for each data
// types............................

// below is the sample code................................
// ---------------------------------------------------------------------------------------------------------------------------------
// public class InputExampleWithArgs{
// public static void main(String args[]){
// int a=Integer.parseInt(args[0]);
// int b=Integer.parseInt(args[1]);
// int c=a+b;
// System.out.println(c);
// }
// }

// -----------------------------------------------------------------------------
// note:----- we have to give input while at the time of executing the file
// itself

// C:\Users\Sudeep Kumar\Desktop\semester 4>javac InputExampleWithArgs.java

// C:\Users\Sudeep Kumar\Desktop\semester 4>java InputExampleWithArgs 15 16
// 31



// ---------------------------------------------------------------------------------------------------

// input of the character in hava.programming............!!!!!!!!!!!
// at first we get the character as string and by using string charAt() method we get the char.....................!
// import java.util.Scanner;
// public class InputCharacter{
// public static void main(String args[]){
// Scanner obj=new Scanner(System.in);
// String str=obj.next();
// char ch=str.charAt(0);
// System.out.println("the character entered is :"+ch);
// }
// }
