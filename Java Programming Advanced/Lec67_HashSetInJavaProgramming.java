
import java.util.HashSet;

public class Lec67_HashSetInJavaProgramming{
    public static void main(String[] args) {
        System.out.println("This is about HashSet in java programming");
        System.out.println("HashSet having a default capacity of 16 and default load factor is 0.75");
        HashSet<Integer>myhashset=new HashSet<>(6,0.5f);
        myhashset.add(8);
        myhashset.add(6);
        myhashset.add(3);
        myhashset.add(11);
        myhashset.add(11);
        // note:----------------------- multiple baar same element add krege to wo ek hi baar mana jaayage.................!
        System.out.println(myhashset);

    }
}

// note:----------- for more uses we can go through the doucmentation of the java programming language................!