public class Lec54_TryCatchBlockInJava {
    public static void main(String[] args) {
        System.out.println("this is about try and catch block in exception handling in java programming");
        int a = 6000;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.print("WE FAIL TO DIVIDE DUE  TO REASON : ");
            System.out.println(e);
        }

        System.out.println("end of the programme");

    }
}

// note:--------- agr bina try block ke likhege to error aayega exception ka aur
// neeche ka code execute nhi hoga aur agr try block mein likhege
// to exception handle hone ke saath saath neeche ka code bhi run kr
// jaayega...............!