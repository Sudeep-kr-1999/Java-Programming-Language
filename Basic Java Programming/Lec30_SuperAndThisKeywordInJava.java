class EkClass {
    int a;

    EkClass(int v) {
        // a=v;
        System.out.println("i am the constructor of EkClass");
        this.a = v;

    }

    public int getA() {
        return a;
    }

    public int returnone() {
        return 1;
    }

}

class DoClass extends EkClass {
    DoClass(int c) {
        super(c);
        System.out.println("Mai ek constructor hu Doclass k");
    }
}

public class Lec30_SuperAndThisKeywordInJava {
    public static void main(String[] args) {
        System.out.println("Super() and \"this\" keyword in java programming.");
        // EkClass e=new EkClass(3);
        // System.out.println(e.getA());
        // DoClass dc = new DoClass(5);

        // note:------------> this is just like self in python
        // this:-------> it is a way to reference the object of the class which is being
        // created........!!!!!
    }
}
