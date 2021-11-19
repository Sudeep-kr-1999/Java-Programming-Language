public class Lec59_FinallyBlockInJava {
    public static int greet() {

        try {
            int a = 50;
            int b = 0;
            int c = a / b;
            return c;

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("cleaning up resources....this is the end of the function");
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println("This is about finally block in java programming");
        // finally block contains the code which is always executed wether the excption
        // is handled or not..
        // it is used to execute the code containing instructions to release the system
        // resources, close a connection etc...!

        // note:--------finally block kisi bhi haal mein run hoga chahe kuch bhi ho
        // jaaye.................!!!!!!!!!
        int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 9;
        while (true) {
            try {
                System.out.println(a / b);

            } catch (Exception e) {
                System.out.println(e);
                break;

            }

            finally {
                System.out.println("I am finally for value of b : " + b);
            }
            b--;
        }

        // note:-------------- try ke saath catch zaroori h but agr hum catch use n kre
        // aur uske jagah finally use kre to bhi chalega bs
        // Exception handle nhi hoga.... bt kbhi bhi try block akele nhi rhega.......!!

        try {
            System.out.println(a / b);
        } finally {
            System.out.println("this is finally with try and here we are not using catch block to handle the execption");
        }

    }
}
