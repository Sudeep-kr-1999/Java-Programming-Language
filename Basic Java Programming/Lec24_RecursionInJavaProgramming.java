public class Lec24_RecursionInJavaProgramming {
    static int recursive_factorial(int n) {
        // factorial n= n*n-1*n-2*...........1
        if (n == 0) {
            return 1;
        }
        int ans = n * recursive_factorial(n - 1);
        return ans;

    }

    public static void main(String[] args) {
        System.out.println("Recursion in java programming");
        // Recursion:--------> It means function call itself again and again while the
        // base case is reached..........!!!!!!!!!!
        System.out.printf("The factorial of 5 is %d", recursive_factorial(5));
    }
}
