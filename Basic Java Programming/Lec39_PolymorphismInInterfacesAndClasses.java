interface MyCamera2 {
    void takeSnap();

    void recordVideo();

    default void record4kVideo() {
        greet();
        System.out.println("Recording in 4k.........");

    }

    private void greet() {
        System.out.println("Good morning!");
    }
}

interface Mywifi2 {
    String[] getNetworks();

    void conectToNetwork(String network);
}

class MyCellPhone2 {

    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall(int phoneNumber) {
        System.out.println("Connecting" + phoneNumber);
    }

}

class MySmartPhone2 extends MyCellPhone2 implements Mywifi2, MyCamera2 {
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    public void recordVideo() {
        System.out.println("Record Video");
    }

    public void conectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

    // public void record4kVideo() {
    // System.out.println("taking snap and recording in 4k video.........!");
    // }

    public String[] getNetworks() {
        System.out.println("getting list of networks");
        String[] networklist = { "Harry", "Prashanth", "Anjali156" };
        return networklist;
    }

    public void samplemeth() {
        System.out.println("this is as smartphone method");
    }

}

public class Lec39_PolymorphismInInterfacesAndClasses {
    public static void main(String[] args) {
        System.out.println("Polymorphism in interfaces and classes");
        // Polymorphism means different forms of one thing.............!!!!!!!!!!!!

        // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = = = = = = = = = = = = = =

        // very very important logic in Polymorphism......!
        // note:--------> the below line means this is a SmartPhone but please use it as
        // a camera the methods outside camera is not allowed.!

        MyCamera2 cam1 = new MySmartPhone2();
        // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = = = = = = = = = = = = = =

        // note:---------> it is not allowed for good..........!!!!!!
        // cam1.getNetworks();

        // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = = = = = = = = = = = = = =

        // note:---------> even we are not allowed to use the method of SmartPhone other
        // than camera..............!!!!!!!!
        // cam1.samplemeth();

        // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = = = = = = = = = = = = = =

        cam1.record4kVideo();

        MySmartPhone2 s = new MySmartPhone2();
        s.samplemeth();
        s.record4kVideo();
        s.record4kVideo();
        s.getNetworks();
        s.callNumber(74);
    }
}
