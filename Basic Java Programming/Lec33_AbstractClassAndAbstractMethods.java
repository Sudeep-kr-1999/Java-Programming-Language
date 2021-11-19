
abstract class Parent2 {
    public Parent2() {
        System.out.println("Im the constructor of Base2 class");
    }

    public void sayhello() {
        System.out.println("Say hello!");
    }

    abstract public void greet();
    // note:-------> abstract class mein jo method hoga usko uske subclasses apne
    // hisab se override krke chla lege....!
    // abstract class khud nhi chl paayega kyuki iska object nhi bna
    // skte............!

}

class Child_2 extends Parent2 {
    // note:-----------> agr child class abstract class ka sub class h to use
    // abstract class ke saare abstract method ko override krna hi parega!
    // ya phir isse bhi abstract kr do (very very important)!!!!
    // nhi to error aayega...............!!!!!!!
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}

class child_3 extends Parent2 {

    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    public void th() {
        System.out.println("I am good!");
    }
}

public class Lec33_AbstractClassAndAbstractMethods {
    public static void main(String[] args) {
        System.out.println("Abstract classes , abstract methods and interfaces");
        // abstract method:-------> a method that is declared without an implementation
        // !
        // abstract class:---------------> if a class includes atleast one abstract methods then the
        // class itself is abstract class . isme non abstract methods bhi ho skte h!

        // abstract classes wo classes h jiski help lekr aur classes bnege.......!
        // ek abstract method puri class ko abstract bna deta h

        // note:----------> abstract class ka object nhi banega but it is possible to create reference of the abstract class........!!!!!!!

    }
}