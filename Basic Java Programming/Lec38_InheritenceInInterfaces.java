interface sampleInterface {
    void meth1();

    void meth2();
}

// here is inheritence in interfaces..............!
interface childSampleInterface extends sampleInterface {
    void meth3();

    void meth4();
}

class MySampleClass implements childSampleInterface {

    // note:-------> (very very important note)
    // note:--------> agr class kisi interface ko implement kr rha h aur agar wo
    // interface kisi dushre interface se extends ho rha h to hme us
    // dushre interface ke method ko bhi class mein define krna
    // hoga..................!!!!!!!!!!
    public void meth3() {
        System.out.println("meth 3");
    }

    public void meth4() {
        System.out.println("meth 4");
    }

    public void meth1() {
        System.out.println("meth 1");

    }

    public void meth2() {
        System.out.println("meth 2");
    }
}

public class Lec38_InheritenceInInterfaces {
    public static void main(String[] args) {
        System.out.println("Inheritence in interfaces!");
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
