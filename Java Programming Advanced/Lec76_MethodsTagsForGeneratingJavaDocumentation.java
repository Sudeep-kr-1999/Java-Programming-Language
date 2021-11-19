/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry
 * @author Harry (code with harrry)
 * @version 0.1
 * @see java Docs
 * @since 2002
 **/

public class Lec76_MethodsTagsForGeneratingJavaDocumentation {
    /**
     *
     * @param args these are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("this is about java doc tags fo methods");

    }

    /**
     * Hello this is a method which describe the method in java doc
     * @param i this is the first number to add
     * @param j this is the second number to add
     * @return this is the sum of two numbers as an integer
     * @throws Exception if i is 0
     * @deprecated this method is depricated please use + operator
     */
    public int add(int i, int j)throws Exception{
        if(i==0){
            throw  new Exception();
        }
        int c;
        c=i+j;
        return c;
    }
}
