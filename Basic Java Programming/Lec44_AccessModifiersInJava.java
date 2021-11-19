class C1 {
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;

    public void meth1() {
        // note:-------- public , protected and default ko same package ke andar use kr
        // skte h private use nhi kr skte h
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

}

class C2 extends C1{
    // note:--------------- subclasses mein sirf public and protected hi access ho skte h default and private access nhi hoge....!!!!!!

}

public class Lec44_AccessModifiersInJava {
    public static void main(String[] args) {
        System.out.println("Access Modifiers In Java Programming");

        C1 c = new C1();
        // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);
    }
}


// important table:-------------------

// Modifiers           class          packages        subclasses      world
// Public                yes             yes              yes          yes
// Protected             yes             yes              yes          no
// Default               yes             yes              no           no
// Private               yes             no               no           no

