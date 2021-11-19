class Base1 {
    public int x;

    public Base1() {
        System.out.println("Im the constructor of Base1");
    }

    public Base1(int a) {
        System.out.println("Im the  overloaded constructor of Base1 with value of a as : " + a);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;

    }
}

class Derived1 extends Base1 {
    public int y;

    public Derived1() {
        // super( int) add krne se kya hoga ki jab derive class base class ke
        // constructor ko build krke(bina argument wla constructor) aayega aur wo
        // jab khud ko build krne lagega to use pta padega ki upar ek aur constructor h
        // jo ek integer lega aur agr wo constructor base mein available
        // h to wo again use build krne chla jaayega aur use build krne ke baad khud ke
        // constructor ko build krega......!!!
        // (very very important)......................!

        // super(5);
        System.out.println("Im the constructor of Derived1");

    }

    public Derived1(int x, int y) {
        super(x);
        System.out.println("i am a overloaded constructor of derived1 class with value a ,b is :" + x + " and" + y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;

    }
}

class Childofderived1 extends Derived1 {
    Childofderived1() {
        System.out.println("i am a child of derived1 constructor");

    }

    Childofderived1(int x, int y, int z) {
        super(x, y);
        System.out.println("i am a overloaded constructor of child of derived1 with x,y,z : " + x + " " + y + " " + z);
    }
}

public class Lec29_ConstructorsInInheritenceInJavaAndSuperKeyword {
    public static void main(String[] args) {
        System.out.println("Constructors in inheritence in java programming and super keyword also");
        // Base1 b = new Base1();
        // Derived1 d=new Derived1();
        // Derived1 d = new Derived1(4, 5);
        // Childofderived1 cd=new Childofderived1();
        // Childofderived1 cd = new Childofderived1(12, 13, 15);

        // note:--------> derived class ka object bnnane ke saath hi wo base class k
        // without any argument wla constructor ko run krega by default
        // agar constructor overloaded h.............!!!

    }
}
