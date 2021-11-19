public class Lec14_JavaWhileLoops {
    public static void main(String[] args) {
        // System.out.print("While Loops in java programming");
        // System.out.println(1);
        // System.out.println(2);

        // loops used to do the task which include repetition
        System.out.println("Using while loops in java programming");
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i += 1;
        }

        System.out.println("Finished while loops!!!");

        while (true) {
            System.out.println("I am a infinite while loop");
        }

        // NOTE:---------------> while(1) as used in c and c++ cannot be used in java
        // programming it is not considered as the boolean

        // while(1){
        // System.out.println("print in while loop");
        // }
    }

}
