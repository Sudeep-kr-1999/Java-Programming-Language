public class Lec18_ArraysInJava {
    public static void main(String[] args) {
        System.out.println("Arrays in java programming");
        // Classroom of 500 students and we have to store the marks of these 500
        // students......!
        // we have two options:--
        // 1----> create 500 variables
        // 2-----> arrays in java programming

        // we can use 3 ways to initialize the array................!!!!!!!!!!!!!!!!
        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 60;
        ;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;
        // marks[5]=96; throws error beause maximum 5 elements is already allocated
        // above..........!!!!!!!
        System.out.println(marks[4]);
        // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = == = = = = = = = = = = == ==
        // int marks1[]=new int [5];
        // marks1[0]=100;
        // marks1[1]=60;;
        // marks1[2]=70;
        // marks1[3]=90;
        // marks1[4]=86;
        // System.out.println(marks1[4]);
        // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = == = = = = = = = = = = == ==

        // int marks4[];
        // marks4=new int[5];
        // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = == = = = = = = = = = = == ==

        // int [] marks5={1,2,3,4,5};

        // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = == = = = = = = = = = = == ==

        // this syntax which is generally used in c and c++ is not allowed in java
        // programming.................!!!!!!!!!!!!1
        // int marks3[];
        // marks3[0]=100;
        // marks3[1]=60;;
        // marks3[2]=70;
        // marks3[3]=90;
        // marks3[4]=86;

    }
}
