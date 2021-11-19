// import java.util.Scanner;

public class Lec56_NestedTryCatchBlock {
    public static void main(String[] args) {
        System.out.println("this is about nested try catch block in java programming");
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        // Scanner sc = new Scanner(System.in);
        System.out.print("enter the index you want to search : ");
        // int ind = sc.nextInt();
        try {
            System.out.println("welcome to video of nested try catch block in java");
            try {
                // System.out.println(marks[ind]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("sorry this index does not exist in this array");
                System.out.println("exception in level 2");

            }

        } catch (Exception e) {
            System.out.println("exception in level 1");

        }
    }
}
