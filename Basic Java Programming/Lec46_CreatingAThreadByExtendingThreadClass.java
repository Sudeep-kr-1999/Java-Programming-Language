class MyThread1 extends Thread {
    int i = 0;

    // note:------------run() is a function inside the thread class
    @Override
    public void run() {
        while (i < 4000) {
            System.out.println("My Cooking Thread is running");
            System.out.println("i am happy");
            i++;
        }
    }

}

class MyThread2 extends Thread {
    int j = 0;

    @Override
    public void run() {
        while (j < 4000) {
            System.out.println("Thread 2 for chating with her is good");
            System.out.println("i am very well");
            j++;
        }
    }

}

public class Lec46_CreatingAThreadByExtendingThreadClass {
    public static void main(String[] args) {
        System.out.println("Creating a thread by extending thread class");
        System.out.println("creating thread by extending thread class in java programming");
        System.out.println("Multithreading humko concurrency achieve kr ke deti h!");
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        // note:-------- start method is used to start the thread........!
        t1.start();
        t2.start();

        // note:------- there is difference between concurrency and parallelism
        // in concurrency we take over several works but we can do only one work at a
        // time means ek time pr several works mein se ek hi kr skte h
        // but dhyan sbhi pr rakhege......!

        // in parallelism hum un saare works ko ek saath krte h means agr hum ek kaam kr
        // rhe h to saath saath dushra kaam bhi kr rhe h by us or some
        // other source!!!!!!

        // func1();-----> multithreaded environment
        // func2();------> multithreaded environment
        // some other line of code........!

        // note:-----------> for working with thead we must use start() and run()
        // function as implemented above...........!!!!!!!!
    }
}
