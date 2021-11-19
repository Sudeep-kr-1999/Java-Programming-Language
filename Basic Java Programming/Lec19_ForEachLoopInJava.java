public class Lec19_ForEachLoopInJava {
    public static void main(String[] args) {
        System.out.println("For each loop in java programming");
        int[] marks = { 98, 45, 79, 99, 88 };
        // float [] marks={98.5f,45.7f,79.9f,99.9f,88.8f};
        // System.out.println(marks[0]);

        // to get the length of the array marks we use (marks.length)
        // System.out.println(marks.length);

        // array of strings can also be made
        // String [] students={"sudeep","ravi","rohan","binod"};
        // System.out.println(students[2]);
        // System.out.println(students.length);

        // displaying the array(Naive way) Naive means---------> a general bruteforce
        // way
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);

        // displaying using for loops
        // System.out.println("Printing array using for loops");
        // for(int i=0;i<marks.length;i++){
        // System.out.println(marks[i]);
        // }

        // for each loops in java programming(very very important):
        for (int element : marks) {
            System.out.println(element);
        }

    }
}
