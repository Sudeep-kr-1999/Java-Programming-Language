
class MyNewThr1 extends Thread {

    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("I am a thread with name " + this.getId());
            i++;

        }

    }
}

class MyNewThr2 extends Thread {

    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("I am a thread with name " + this.getId());

            // Thread.sleep(millis);-----> this function will be in the try catch
            // block..............!!!!!!!!!!!
            // millis---------------> it is abbreviated for miliseconds
            try {

                // note:--------- sleep ho jaayega 455 miliseconds ke
                // liye.............!!!!!!!!!!!!!!!
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;

        }

    }
}

public class Lec51_ThreadMethods {
    public static void main(String[] args) {
        System.out.println("Thred methods in java programming");
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        // / note:------ t1.join()----> ye join function kya krega ki ye wait krega jbtk
        // t1 khtm n ho jaaye uske baad alge thred ko start krega.!
        // Waits for this thread to die.

        // Exception handling............!!!!!!!!!!!!!!!!
        // ye Exception handling isliye use krege kyuki join() agr chalayege directly to
        // ye possibility h ki ye ek exception throw kre ki chalate
        // samay t1 kill ho gya h to ise handle krne ke liye exception handling use
        // krege..............!!!!!!!!!!!!

        // == = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = = = = = = = = = = = = = = = = = =
        // t1.start();
        // try {
        // t1.join();
        // }

        // catch (Exception e) {
        // System.out.println(e);
        // }
        // t2.start();
        // == = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = = = = = = = = = = = = = = = = = =

        t1.start();
        t2.start();

    }
}

// note:------------- we can use different method in thread as per our
// requirements...............!!!!!!!!!!!!!!!!