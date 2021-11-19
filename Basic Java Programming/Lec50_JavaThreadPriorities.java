class MyThr1 extends Thread {
    public MyThr1(String Name) {
        super(Name);

    }

    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("I am a thread with name " + this.getName());
            i++;

        }

    }
}

public class Lec50_JavaThreadPriorities {
    public static void main(String[] args) {
        System.out.println("this is about java thread priorities");
        MyThr1 t1 = new MyThr1("Sudeep and it is having the first priority in the threads");

        // note:------------- to set the priority we use:-----------------
        // note:--------- priority set krne pr most important priority waala thread sbse
        // jyda baar aayega means CPU us thread ko sbse jyda time dega......!

        t1.setPriority(Thread.MAX_PRIORITY);
        MyThr1 t2 = new MyThr1("Chachi");
        MyThr1 t3 = new MyThr1("Paglu");
        MyThr1 t4 = new MyThr1("Beshram");
        MyThr1 t5 = new MyThr1("Kamine");
        t5.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        // how thread work on java virtual machine(JVM)

        // the jdk has ready Queue with threads maintained by thread scheduler which is
        // under jvm-------> T1 T2 T3 T4 T5 T6....

        // java thread having generally 3 types of prioroties.....!
        // 1. min priority------------> by default value is 1
        // 2 . norm priority------------> by default value is 5
        // 3. max priority-------------> by default value is 10
    }
}
