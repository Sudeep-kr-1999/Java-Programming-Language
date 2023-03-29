import java.util.*;
public class Lec63_ArrayListInJavaDemoAndMethods {
    public static void main(String[] args) {
        System.out.println("Array list in java : Demo and Methods");

        // below is the syntax of generics................like template in c++...!
        ArrayList<Integer>l1=new ArrayList<>();
        // ArrayList<Integer>l2=new ArrayList<>(5);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);
        l1.add(0,7);
        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println(l1);
        // l1.remove(4);
        // for (int i=0;i<l1.size();i++){
        //     System.out.println(l1.get(i));
        // }
        // l1.remove(4);
        // for (int i=0;i<l1.size();i++){
        //     System.out.println(l1.get(i));
        // }

        // note :-----------------in case of integer both remove with index and object work same.......!


        // note:-------- to check wether the element is present in the arraylist or not.........!!!!!!!!!
        // System.out.println(l1.contains(27));

        // to find the initial index of the element...........!!!!!!!!!!
        // System.out.println(l1.indexOf(7));
        // note:------- agr element present nhi h to  "-1" dega............!

        // note:------ to give the index from the backward side..........(basically last index)
        // System.out.println(l1.lastIndexOf(7));
        // l1.set(index, element)------------------ kisi index pr ek number ki jagah dushre no. ke set krega ya direcly index pr no. set krega!

        // l2.add(6);
        // l2.add(7);
        // l2.add(4);
        // l2.add(6);
        // l2.add(5);

        // note:------------- to add all element of l1 to the l2...........!!!!!
        // l2.addAll(l1); -----------> ye bydefault end se add krega agr zero se add krna h to (l2.addAll(index,l2))krege jisme index initial index h jha se add krna suru krna h...!

        // for (int i=0;i<l2.size();i++){
        //         System.out.println(l2.get(i));
        //     }
    }
}
// note:--------- here l1.add(index,element) method is used to add element in the specific index in the ArrayList agar ek argument dege to bydefault append krega
//                here l1.size() method is used to get the size of the ArrayList
//                here l1.get() is used to get the element in the ArrayList
                //   ArrayList<Integer>l2=new ArrayList<>(5); : -------> initializing array list with initial capacity
                // to clear we use l1.clear()
