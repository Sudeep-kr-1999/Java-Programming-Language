class MymainEmployee {
    private int id;
    private String name;

    // it is the constructor of the MymainEmployee class
    // note:--------> constructor bnane ke saath hi object call ho jaayega aur
    // constructor function execute ho jaayega
    // means humare naye object bnaate hi constructor invoke ho jaayega aur function
    // krega......!!!!!!!

    // constructor ka name class ke name ke equals hota h aur return value nhi hoti
    // generally...!

    // method overloading can also be possible in case of constructor

    public MymainEmployee() {
        id = 11917205;
        name = "Your name here";
    }

    // CONSTRUCTOR WITH PARAMETER.......!!!!!!!!!
    public MymainEmployee(String myname, int myid) {
        name = myname;
        id = myid;

    }

    public void setName(String s) {
        name = s;

        // "this" can also be used here
        // this.name=s;

    }

    public String getName() {
        return name;
    }

    public void setID(int n) {
        id = n;

        // "this" can also be used here
        // this.id=n;
    }

    public int getID() {
        return id;

    }

}

public class Lec27_ConstructorsInJava {
    public static void main(String[] args) {
        System.out.println("Constructors in java programming");

        // = = = = = = == = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = = = = = = = = = = =
        // // WITHOUT CONSTRUCTOR BY MAKING OBJECT EXPLICITLY.........!
        // MymainEmployee sudeep=new MymainEmployee();
        // sudeep.setName("Sudeep");
        // sudeep.setID(11917205);
        // System.out.println(sudeep.getName());
        // System.out.println(sudeep.getID());

        // = = = = = = == = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = = = = = = = = = = =

        // WITH CONSTRUCTOR.............!
        // MymainEmployee sudeep = new MymainEmployee();
        MymainEmployee sudeep = new MymainEmployee("Sudeep", 11917205);
        System.out.println(sudeep.getName());
        System.out.println(sudeep.getID());

    }
}
