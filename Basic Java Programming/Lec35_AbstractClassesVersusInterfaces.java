
interface Bicycle {
    // note:---------> interface mein jo variable ki value de di wo public static final ho jaati
    // h....
    int a = 45;
    // can be also written as....!
    // final int a=45;

    void applyBrake(int decrement);

    // can also be written as:---> because interface ki method already public hoti h
    // hum likh bhi skte h aur nhi bhi.....!!!
    // public void applyBrake(int decrement);

    void speedup(int increment);

}

interface HornBicycle {

    void BlowHorn1();

    void BlowHorn2();

}

// note :-------------> we can use more than one interfaces at a time to
// implement in the single class...(very very important).!!!!!!
class AvonCycle implements Bicycle, HornBicycle {
    void blowhorn() {
        System.out.println("Pee pee poo poo...!!!!!");
    }

    // very very important note::::::::::
    // note:----------> interface ke method ko apply krte time use "public" bnana
    // compulsary h.............!!!!!!!!!
    public void applyBrake(int decrement) {
        System.out.println("Applying brake");
    }

    public void speedup(int increment) {
        System.out.println("Speedup");
    }

    public void BlowHorn1() {
        System.out.println("it is blowhorn 1");
    }

    public void BlowHorn2() {
        System.out.println("it is blowhorn 2");
    }
}

public class Lec35_AbstractClassesVersusInterfaces {
    public static void main(String[] args) {
        System.out.println("Abstract classes versus interfaces");
        AvonCycle cycle1 = new AvonCycle();
        cycle1.applyBrake(1);

        // note:------> it is allowed you can create properties in interfaces........!
        // System.out.println(cycle1.a);

        // note:-------- you cannot modify the properties in interfaces as they are
        // final.....!
        // give us the error.... The final field Bicycle.a cannot be assigned
        // cycle1.a=56;
        // System.out.println(cycle1.a);

    }

    // note:---------> ek class ko 2 Abstract classes ke help se extends nhi kr skte
    // h...........!
}
