class A {
    public int a;

    public int harry() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am method 2 of class A");
    }
}

class B extends A {
    // IT IS CALLED METHOD OVERRIDING.................!!!!!!!!!!!!!
    // @Override:------ DENOTE IT IS OVERRIDE..............( we can write or we may
    // not)!

    // note:---------> overriding means redefining method of the superclass
    // argument list should be exactly same
    // return type should be same or subtype of the purane type k!
    // access level restrictive nhi honi chahiye means jis method ko overriding kr
    // rhe wo public h to public rhegi!
    // static method ko override nhi kr skte
    // final method ko override nhi kr skte
    @Override
    public void meth2() {
        System.out.println("I am method 2 of class B");
    }

    public void meth3() {
        System.out.println("I am method 3 of class B");
    }

}

public class Lec31_MethodOverridingInJava {
    public static void main(String[] args) {
        System.out.println("Methods Overriding in java programming");
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();

    }
}
