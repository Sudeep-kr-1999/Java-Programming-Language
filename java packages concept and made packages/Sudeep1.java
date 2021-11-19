// package Sudeeppack2;
// package sudeeppack;

// for making package inside packages and load the class files...
// package Sudeep4.Sudeep5;
// package Sudeep4 ke andar Sudeep5 mein file jaayega

public class Sudeep1 {
    public static void main(String[] args) {
        // System.out.println("this is sudeep 1");
    }
}

// to make class file
// PS E:\COMPUTER LANGUAGES FOLDER\JAVA PROGRAMMING\java packages concept and
// made packages> javac Sudeep1.java (note the spaces : javac then space then
// filename.java)

// to putfile(class files are put there) to package defined above one by
// one.----------------(not package name may contain keyword or capital
// letters)
// PS E:\COMPUTER LANGUAGES FOLDER\JAVA PROGRAMMING\java packages concept and
// made packages> javac -d. Sudeep1.java (note the spaces : javac then space
// then -d then dot then space then filename.java)
// note:----------javac -d ke baad dot lagane par hum jha h whi package bn
// jaayega agr hum kisi ke andr bannane chahte h to javac -d ke baad
// (name of the folder where we want to make the package).filename.java

// to put all files(class files) into the package in one go....
// PS E:\COMPUTER LANGUAGES FOLDER\JAVA PROGRAMMING\java packages concept and
// made packages> javac -d. *.java

// note:---------- package bnate time class files khud bnkr package mein chli
// jaayegi.......!
