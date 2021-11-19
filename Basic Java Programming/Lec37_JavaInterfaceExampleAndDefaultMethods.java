interface MyCamera {
    void takeSnap();

    void recordVideo();

    // Note:---------- very very important logic.............!!!!!!

    // default lagane par jitne bhi classes interface ko implement kr rhi hogi usme
    // default method automatically implement ho jaayega
    // class mein jaakr use define krne ki jaroorat nhi hogi kyuki hum use interface
    // mein hi define kr chuke the but agar hum chahe to class
    // mein ise override kr skte h......................!!!!!!!!!!!!!

    default void record4kVideo() {
        greet();
        System.out.println("Recording in 4k.........");

    }

    // we cannot use this method outside because it is private......... but hum ise
    // interface ke itself undr logic implement ke liye use
    // kr skte h!
    private void greet() {
        System.out.println("Good morning!");
    }
}

interface Mywifi {
    String[] getNetworks();

    void conectToNetwork(String network);
}

class MyCellPhone {

    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall(int phoneNumber) {
        System.out.println("Connecting" + phoneNumber);
    }

}

class MySmartPhone extends MyCellPhone implements Mywifi, MyCamera {
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    public void recordVideo() {
        System.out.println("Record Video");
    }

    public void conectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

    // uppar waale method ko override krne par upar wala method kaam nhi
    // krega.........!!!!!!!!!
    // public void record4kVideo() {
    // System.out.println("taking snap and recording in 4k video.........!");
    // }

    public String[] getNetworks() {
        System.out.println("getting list of networks");
        String[] networklist = { "Harry", "Prashanth", "Anjali156" };
        return networklist;
    }

}

public class Lec37_JavaInterfaceExampleAndDefaultMethods {
    public static void main(String[] args) {
        System.out.println("Java interface examples and default methods");
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();

        // note:-------> throw error because it is private method in the
        // interface...........!!!!
        // ms.greet();

        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }

    }
}
