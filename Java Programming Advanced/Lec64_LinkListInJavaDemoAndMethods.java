import java.util.*;

public class Lec64_LinkListInJavaDemoAndMethods {

    public static void main(String[] args) {
        System.out.println("Link List In Java : Demo And Methods");

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);
        l1.add(0, 7);

        // note:------------------ l1.addFirst(); and l1.addLast(); are the property of
        // linklist not of array list.........!!!!!!!!
        // and this is due to the collection hierarcy
        l1.addFirst(9);
        l1.addLast(14);
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        System.out.println(l1.contains(27));

        System.out.println(l1.indexOf(7));
        System.out.println(l1.lastIndexOf(7));
    }
}

// note:------------- arraylist ke bhut se method LinkedList mein
// milege...........( very very important)!!!!!!!

// if we want more then we go for the documentation of the java collection as
// per our use...................!!!!!!!!!!