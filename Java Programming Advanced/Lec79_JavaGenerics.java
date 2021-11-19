// import java.util.ArrayList;

// class MyGenerics<T1, T2> {
//     int val = 344;
//     private T1 t1;
//     private T2 t2;

//     public MyGenerics(int val, T1 t1, T2 t2) {
//         this.val = val;
//         this.t1 = t1;
//         this.t2 = t2;

//     }

//     public int getVal() {
//         return val;
//     }

//     public void setVal(int val) {
//         this.val = val;
//     }

//     public T1 getT1() {
//         return t1;
//     }

//     public void setT1(T1 t1) {
//         this.t1 = t1;
//     }

//     public void setT2(T2 t2) {
//         this.t2 = t2;
//     }

//     public T2 getT2() {
//         return t2;
//     }

// }

// public class Lec79_JavaGenerics {
//     public static void main(String[] args) {
//         System.out.println("This is about java generics");
//         ArrayList<Integer> arrayList = new ArrayList<Integer>();

//         // -------------------------------------------------------------------------------------------------------------------------
//         // this will produce an error since int is a premeetive data type
//         // ArrayList<int> arrayList=new ArrayList<int>();
//         // ----------------------------------------------------------------------------------------------------------------------------

//         // arrayList.add("str1");
//         arrayList.add(54);
//         arrayList.add(643);
//         // arrayList.add(new Scanner(System.in));

//         // we have to type cast if we donot use generics...............!
//         // int a=(int)arrayList.get(2);

//         // if we use generics we donot need to typecast....!
//         int a = arrayList.get(1);
//         System.out.println(a);
//         MyGenerics<String, Integer> g1 = new MyGenerics(5, "MyString is my string ", 45);
//         String str = g1.getT1();
//         Integer int1 = g1.getT2();
//         System.out.println(str);
//         System.out.println(int1);

//     }
// }