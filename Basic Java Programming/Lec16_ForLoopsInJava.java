
public class Lec16_ForLoopsInJava {
    public static void main(String[] args) {
        System.out.println("For loops in java programming");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // 2n=even numbers ===> 2,4,6,8.......
        // 2n+1 or 2n-1======> 1,3,5,7,........

        // // TABLE OF 5!
        int i = 5;
        for (int j = 1; j <= 10; j++) {
            System.out.print("5x");
            System.out.print(j);
            System.out.print("=");
            System.out.println(i * j);

        }

        // FIRST 5 ODD NUMBERS
        // int n=5;
        for (int k = 0; k < 5; k++) {
            System.out.println(2 * k + 1);

        }

        for (int a = 5; a >= 0; a--) {
            System.out.println(a);
        }

    }
}
