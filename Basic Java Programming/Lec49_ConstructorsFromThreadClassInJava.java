
class MyThr extends Thread {
    public MyThr(String Name) {
        super(Name);

    }

    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("I am a thread");
            i++;

        }

    }
}

public class Lec49_ConstructorsFromThreadClassInJava {
    public static void main(String[] args) {
        System.out.println("Constructors from thread class in java programming");
        MyThr t1 = new MyThr("Sudeep");
        MyThr t2 = new MyThr("Chachi");
        t1.start();
        t2.start();

        // note:----------> t.getId() this function is used to get the id of the current
        // thread.....!!!!!!!!!!
        System.out.println("The id of the thread is : " + t1.getId());
        System.out.println("The name of the thread is : " + t1.getName());
        System.out.println("The id of the thread is : " + t2.getId());
        System.out.println("The name of the thread is : " + t2.getName());
    }
}

// there are various method to create thread as per requirement we learn the
// method.............!!!!!!!!!!!!

// thread group is also a way to create thread.................................!
