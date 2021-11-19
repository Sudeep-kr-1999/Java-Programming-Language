/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry
 * @author Harry (code with harrry)
 * @version 0.1
 * @see java Docs
 * @since 2002
 **/

//note :----- the above details should be above the class and below the package name
//              and should be between (/** and **/)
//                we can use href in the @see value
//                 we can put description as the fist line above between the (/** and **/)
//                  If we use any html inside the bracket above it will render
//                    /* is the comment but /** is the comment for javadoc
public class Lec75_JavaDocTagsForDocumentingClasses {
    public void add(int a,int b){
        System.out.println("the sum is : "+a+b);

    }
    public static void main(String[] args) {
        System.out.println("this is about java doc tags for documenting classes");

    }
}
