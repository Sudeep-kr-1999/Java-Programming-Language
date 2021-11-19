// = = = =  = = = = ==  = = = =  = = = = = = = = =  = = = = = = = = = = = = = = = = = = = = = = = = = = = = =  = = = = = = = = = = = =
// CUSTOM CLASS MADE BY THE USER...................!!!!!!!!!!!!!!!!!!

class Employee {
    int id;
    String name;
    int sallary;

    public void printDetails() {
        System.out.println("My ID is " + id);
        System.out.println("My name is " + name);
    }

    public int getsalary() {
        return sallary;
    }

}
// = = = =  = = = = ==  = = = =  = = = = = = = = =  = = = = = = = = = = = = = = = = = = = = = = = = = = = = =  = = = = = = = = = = = =
public class Lec25_IntroductionToObjectOrientedProgrammingOOPS {

    public static void main(String[] args) {
        System.out.println("Introdunction to Object Oriented Programming OOP'S");
        System.out.println("This is our custom class");

        // instanciating a new Employee() object.............!!!!!!
        Employee harry = new Employee();
        Employee john = new Employee();
        john.id = 13;
        john.name = "John Triphati";
        john.sallary = 13000;

        // setting attributes..........!!!!!
        harry.id = 12;
        harry.name = "Code with harry";
        harry.sallary = 15000;

        // printing attributes..............!!!!
        // System.out.println(harry.id);
        // System.out.println(harry.name);

        harry.printDetails();
        john.printDetails();
        int sallary = john.getsalary();
        System.out.println(sallary);
    }
}

// note:-------------> ek java file mein ek hi public class hoti h aur agar kuch
// nhi likhte h to access modifier default pr set hota h
