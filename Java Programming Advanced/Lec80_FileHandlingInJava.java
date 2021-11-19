// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;

// public class Lec80_FileHandlingInJava {
//     public static void main(String[] args) {
//         System.out.println("This is about file handling in java programming");

//         // ====================================================================================================================================================
//         // to create a new file
//         File myfile = new File("Lec80_Filehandling1.txt");
//         try {
//             myfile.createNewFile();
//         } catch (IOException e) {
//             System.out.println("Unable to create this file");
//             e.printStackTrace();

//         }


//         // // ====================================================================================================================================================
//         // write to a file.....!
//         try{
//         FileWriter fileWriter=new FileWriter("Lec80_Filehandling1.txt");
//         fileWriter.write("This is our first file from file handling\nok now byeeee......!!");
//         fileWriter.close();
//         }catch(IOException e){
//             System.out.println("cannot able to write in the file");
//             e.printStackTrace();

//         }

//         // ====================================================================================================================================================
//         // reading a file 
//         File myfFile=new File("Lec80_Filehandling1.txt");
//         try {
//             Scanner sc=new Scanner(myfFile);
//             while (sc.hasNextLine()){
//                 String line=sc.nextLine();
//                 System.out.println(line);
//             }

//             sc.close();
//         } catch (FileNotFoundException e) {
//             e.printStackTrace();
//         }


//         // ====================================================================================================================================================
//         // deleting a file
//         File myfFile=new File("Lec80_Filehandling1.txt");
//         if(myfFile.delete()){
//             System.out.println("I have deleted : "+myfFile.getName());

//         }
//         else{
//             System.out.println("some error occoured while deleting the file");
//         }




//     }
// }
