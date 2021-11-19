class MyEmployee {
    private int id;
    private String name;

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

public class Lec26_AccessModifiersConstructorsGettersAndSetters {
    public static void main(String[] args) {
        System.out.println("Access Modifiers,Getters,Setters and Constructors");
        MyEmployee harry = new MyEmployee();
        harry.setName("Code with harry");
        harry.setID(11917205);
        String name = harry.getName();
        int id = harry.getID();
        System.out.printf("name is : %s\n", name);
        System.out.printf("id is : %d\n", id);

        // throws an error due to private access modifiers
        // harry.id=45;
        // harry.name="Code with harry";
    }
}
