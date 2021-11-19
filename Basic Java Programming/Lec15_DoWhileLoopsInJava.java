public class Lec15_DoWhileLoopsInJava {
    public static void main(String[] args) {
        // System.out.println("Using while loops");
        int i = 10;
        // while(i<5){
        // System.out.println(i);
        // i++;
        // }

        System.out.println("Using do while loops");
        // Note:---------> do while loop at least ek baar to execute krega hi chahe
        // condition shi ho ya glt ho!!!!
        do {
            System.out.println(i);
            i++;
        } while (i < 5); // semicolon is important
    }
}
