class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Base() {
        System.out.println("THIS IS THE CONSTRUCTOR  OF BASE");
    }
}

// note:-----> class b extends a:-------------> means class b have all the
// functionality of class a means class b is derived from class a..!
class Derived extends Base {
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

public class Lec28_InheritenceInJava {
    public static void main(String[] args) {
        System.out.println("Inheritece in java programming");
        // Base b=new Base();
        // b.setX(3);
        // System.out.println(b.getX());

        Derived d = new Derived();
        // d.setX(3);
        d.setY(43);
        // System.out.println(d.getX());
        System.out.println(d.getY());

        // note:---------> jaise hi derived class ka object bnayege to wo at that
        // momement just hi base class ka CONSTRUCTOR ko call kr usee
        // construct krega taaki base class ki saari property ko get kr ske aur uske
        // baad khud ke constructor ko build krke andar ka kaam krega
        // (very very important)... Logic............!

        // in simple language pehle base ka constructor bnaega phir derived ka derive ka object bnnte ke saath
    }
}
