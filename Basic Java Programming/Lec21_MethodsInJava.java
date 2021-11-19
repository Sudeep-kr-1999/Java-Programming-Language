public class Lec21_MethodsInJava {
    // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
    // = = = = = = = = = = = = = = = = = = = = = =

    public static int logic(int a, int b) { // ( here we can use static or public static)
        int z;
        z = (a + b) * 5;
        System.out.println(z);
        return z;
    }

    // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
    // = = = = = = = = = = = = = = = = = = = = = =

    // ise execute krwane ke liye class ka object bnana padega bina object ke ye
    // execute nhi krega kyuki ye static nhi h!

    // int logic(int a, int b) { // ( here we can use static or public static)
    // int z;
    // z = (a + b) * 5;
    // System.out.println(z);
    // return z;
    // }

    // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
    // = = = = = = = = = = = = = = = = = = = = = =

    public static void main(String[] args) {
        System.out.println("Methods(Functions) in java Programming");
        int a = 5;
        int b = 7;
        // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = = = = = = = = = = = = = = =
        // calling methods by creating the object (non static method)
        // Lec21_MethodsInJava obj=new Lec21_MethodsInJava();
        // int c=obj.logic(a, b);
        // == = = = = = = = = = = = = = = = = = = = = = = = = = = = = = == = = = = = = =
        // = = = = = = = = = = = = = = = = = = = = = =
        // calling methods directly(static methods)
        int c = logic(a, b);
        // = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // = = = = = = = = = = = = = = = = = = = = = =

        System.out.println(c);

    }
}
// note:------------> agar method mein data type likha hua h to wo pkke se
// return krega chahe kuch bhi ho jaaye agr return nhi krwayege to wo
// error show krega.............!!!!!!!!!

// method mein static lagana padega kyuki hum static method ke andar se sirf
// static ko hi call kr skte h
// agr hum main ke andr se directly kisi method ko call kr rhe bina object bnaye
// to static lgana zaroori ho jaata h....................!!!!!!

// static method class ke object se associate nhi hota instead ye directly class
// se hi associate ho jaata h means alag alg object bnnane se isko koi
// fark nhi padega ye continued rehega same state mein alag alg class ke liye
// reset nhi hoga....................!!!!!!!!!!!!!!