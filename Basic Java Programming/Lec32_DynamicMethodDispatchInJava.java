class Phone {

    public void showtime() {
        System.out.println("time is 1 pm");
    }

    public void on() {
        System.out.println("Turning on phone..........!");
    }
}

class SmartPhone extends Phone {

    public void music() {
        System.out.println("playing music...........!!!");
    }

    public void on() {
        System.out.println("Turning on smartphone..........!!");
    }
}

public class Lec32_DynamicMethodDispatchInJava {
    public static void main(String[] args) {
        // System.out.println("Dynamic method dispatch in java programming");
        // Phone obj= new Phone();
        // obj.on();
        // SmartPhone smobj=new SmartPhone();

        // note:-------> agr reference superclass k h and object subclass k to ye
        // possible h(below):;--
        Phone obj = new SmartPhone(); // it is allowed......!
        obj.showtime();
        obj.on(); // ye SmartPhone waale on() ko run krega kyki object to SmartPhone ka hi bna h
                  // n......!!(it is called runtime polymorphism!-----> runtime because object tb
                  // banega jb programme run hoga)

        // note:---> agr reference subclass k hoga aur object superclass k to ye
        // possible nhi hoga(below):-
        // SmartPhone obj2=new Phone(); // throws error!

        // note:------------> it is not allowed sirf usi function ko call krege jo type
        // obj ka hoga yha pr obj ka type Phone h.......!!!!!
        // obj.music(); // not allowed....!!
    }
}
