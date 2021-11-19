// note:---------------------
// Functional Interface:------------- it is a interface having only one method...........!


interface DemoAno1{
    // void meth1();
    void meth1(int a);
}
interface DemoAno {
    void meth1();

    void meth2();
}


// class Harryfunc implements DemoAno1{
//     @Override
//     public void meth1(){
//         System.out.println("this is meth1 of DemoAno1 interface");
//     }

// }
// class AnonyDemo implements DemoAno {

//     public void display() {
//         System.out.println("hello");
//     }

//     @Override
//     public void meth1() {
//         System.out.println("I am meth1");

//     }

//     @Override
//     public void meth2() {
//         System.out.println("I am meth 2");

//     }

// }

public class Lec78_JavaAnonymsAndLambdaExpressions {

    public static void main(String[] args) {
        System.out.println("Java Anonyms and Lambda Expressions");
        // note:-------------------
        // Anonyms classes are those classes which have not any name below is the example of anonyms class 

        // -------------------------------------------------------------------------------------------------------------------------------------------------------------
        // AnonyDemo obj = new AnonyDemo();
        // obj.meth1();

        // it can also be done :---------------------
        // DemoAno obj1=new AnonyDemo();
        // obj1.meth1();
        // ---------------------------------------------------------------------------------------------------------------------------------------------------------------

        // this is the example of anonyms class
        // anonyms classses are used to make expressions genereally
        // we use anonyms classes generally when we want to use local class for only once...............!!
        // DemoAno obj=new DemoAno(){
        //     @Override
        //     public void meth1(){
        //         System.out.println("i am meth 1");
        //     }

        //     @Override
        //     public void meth2(){
        //         System.out.println("i am meth2");
        //     }
            
        // };

        // obj.meth1();
        // obj.meth2();



        // ===================================================================================================================================================================
        // Lambda Expressions
        // DemoAno1 obj= new Harryfunc();
        // obj.meth1();

        // note:------------------------------------------------
        // lambda expressions is used to directly make the object of that class which implement the interface having only one method in it,that means that interface is functional 
        // interface!

        // DemoAno1 obj=()->{
        //     System.out.println("i am meth 1 from this lembda expression");
        // };
        // obj.meth1();
        // // output:-------------------
        // // i am meth 1
        
        // ===================================================================================================================================================================
        // lambda expression with parameter:---------
        DemoAno1 obj1=(a)->{
            System.out.println("i am meth 1 from this lembda expression "+a);
        };
        obj1.meth1(6);
    }
}
