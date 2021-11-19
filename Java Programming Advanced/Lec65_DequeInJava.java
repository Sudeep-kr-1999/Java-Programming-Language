import java.util.ArrayDeque;

public class Lec65_DequeInJava {
    public static void main(String[] args) {
        System.out.println("Array Deque in java programming");
        ArrayDeque<Integer>ad1=new ArrayDeque<>();
        ad1.add(6);
        ad1.add(7);
        ad1.add(9);
        ad1.addFirst(67);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}