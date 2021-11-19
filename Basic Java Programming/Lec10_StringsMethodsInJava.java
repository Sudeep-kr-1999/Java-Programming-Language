

public class Lec10_StringsMethodsInJava {
    public static void main(String[] args) {
        // System.out.println("Strings methods in java programming");
        // String name="Sudeep";
        // // String a1=new String(original:"Sudeep");
        // System.out.println(name);

        // // name.length() give the length of the name string
        // int value=name.length();
        // System.out.println(value);

        // // name.toLowerCase() changes all the upper case character in the name string into the lower case character
        // String name1=name.toLowerCase();
        // System.out.println(name1);

        // // name.toUpperCase() changes all the LowerCase charcter in the name string into the upper case character
        // String name3=name.toUpperCase();
        // System.out.println(name3);

        // String nontrimmedstring="      Sudeep    kumar     ";
        // System.out.println(nontrimmedstring);

        // // nontrimmedstring.trim() ye string mein se aage aur peeche ke saare spaces ko hta dega beech ke spaces ko kuch nhi krega...!
        // String trimmedString=nontrimmedstring.trim();
        // System.out.println(trimmedString);

        // String name= "Sudeepkumar";

        // // name.substring(beginIndex)---> isme hum beginning index paas krte h phir us index se last index tk string print ho jaata h
        // String name1=name.substring(2);
        // System.out.println(name1);

        // // name.subSequence(beginIndex, endIndex)---> isme hum beginning index and end index dono paas krte h jisme start index include hota h aur
        //                                         //    end index exclude hota h(very very important)....!
        // String name2=name.substring(2,9);
        // System.out.println(name2);

        // String name3="Harry";
        // // // name3.replace(oldChar, newChar)----> ye 2 character leta h aur pure string mein old character ko new character se change kr deta h..!
        // // String name4=name3.replace('r', 'p');
        // // System.out.println(name4);


        // // name3.replace(target, replacement)====> dono argument string lege aur target string ko replacement string se replace kr dega....!
        // String name5=name3.replace("rry","ier");

        // // note:---------> hr target string ko replacement string se replace krna h agar target string n times aata h to har target string saare
        //                 // n target string replacement string se replace kiye jaayege .................!!!!
        // String name6=name3.replace("r","ier");
        // System.out.println(name6);
        // System.out.println(name5);


        // String name="Sudeepkumar";

        // // name.startsWith(prefix)------> return a boolean true or false as wehther the string start with the give prefix string as the argument!
        // System.out.println(name.startsWith("Su"));

        // // name.endsWith(suffix)----> return the boolean true or false as wehther the string ends with the given suffix string as the arguments in the function..!
        // System.out.println(name.endsWith("ar"));

        // // name.charAt(index)-----> return the character at the specific index in the string given...!
        // System.out.println(name.charAt(2));

        // // name.indexOf(str)---> ye hum jo string paas krege as argument in the function wo pehli baar jha occour krega in the given string wha ke pehle index ki value paas kr dega
        // // for ex: here we paas "kum" so string mein kum pehli baar 6th index se kr rha h to ans mein 6 return kr dega....!
        // System.out.println(name.indexOf("kum"));
        // System.out.println(name.indexOf("u"));
        // System.out.println(name.indexOf("i"));
        // // note:--------> if substring is not there then it return -1 (important)

        // // name.indexOf(str, fromIndex)----> ye hum jo string paas krege as argument in the function wo pehli baar jha occour krega given
        // // starting index jo humne diya h as argument wha se (starting index ke pehle waale ko ignore krna h) in the given string wha ke pehle
        // //  index ki value paas kr dega
        // System.out.println(name.indexOf("u",2));
        // System.out.println(name.indexOf("i",2));
        // // note:--------> if substring is not there then it return -1 (important)


        // // name.lastIndexOf(str)----------> ye dekhega ki last se kaun se index pr string exist krega...!
        // System.out.println(name.lastIndexOf("u"));
        // System.out.println(name.lastIndexOf("i"));
        // // note:--------> if substring is not there then it return -1 (important)


        // // name.lastIndexOf(str, fromIndex)----------> ye dekhega ki last se kaun se index pr string exist krega...(given index tk)!
        // // means suppose fromIndex value is 6 to ye index 6 se index 0 tk piche se dekhega aur index return krega.....!
        // System.out.println(name.lastIndexOf("u",2));
        // System.out.println(name.lastIndexOf("i",2));
        // // note:--------> if substring is not there then it return -1 (important)


        // note:-----> generally if we have to check wehther the value of the one string is equal to other string or not we use .equals()
        // String name="Sudeep";
        // String name1="Kumar";
        // String name2="Sudeep";
        // String name3="SUDEEP";
        // String name4="sudeep";
        // System.out.println(name.equals(name1));
        // System.out.println(name.equals("Kumar"));
        // System.out.println(name.equals(name2));
        // System.out.println(name.equals("Sudeep"));

        // // name.equalsIgnoreCase(anotherString)-----> ignore the cases of the string while comparing the 2 strings, case ignore krega
        // //  bs value check krega..........!
        // System.out.println(name3.equalsIgnoreCase(name4));



        // scape sequence character
        System.out.println("I am scape sequence \"double quotes\"");
        System.out.println("I am scape sequence \'single quotes\'");
        System.out.println("I am scape sequence \\backslash");
    //     for double quotes====> "\"........\""
    //     for single qotes======>"\'.........\'"
    //     for only backslash=====> "\\"
    }
}
