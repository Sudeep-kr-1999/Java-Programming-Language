class MyThreadRunnable1 implements Runnable {
    int i = 0;

    public void run() {
        while (i < 400) {
            System.out.println("i am a thread 1 not a threat 1");
            i++;
        }

    }
}

class MyThreadRunnable2 implements Runnable {
    int i = 0;

    public void run() {
        while (i < 400) {
            System.out.println("i am a thread 2 not a threat 2");
            i++;
        }

    }
}

public class Lec47_CreatingAThreadUsingRunnableInterface {
    public static void main(String[] args) {
        System.out.println("Creating a thread using runnable interface in java programming");
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

        // note:------------- is way of threading mein pehle hum runnable interface ko
        // implements krege then us implements object ko thread object
        // mein paas krege aur thread object se start() call krege..........(har
        // runnable object ke liye alag alg thread object hoga)!!

        // note:--------------
        // java.lang.Thread.Thread(Runnable target)
    }
}
