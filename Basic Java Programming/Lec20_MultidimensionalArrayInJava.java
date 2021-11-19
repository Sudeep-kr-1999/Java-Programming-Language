
public class Lec20_MultidimensionalArrayInJava {
    public static void main(String[] args) {
        System.out.println("Multidimensional arrays in java programming");
        // arrys of Arrays
        // multidimensional array :-------- arrays nested under arrays ..... and going
        // on....!!!!!!!!!!
        // 2 dimensional arrays
        // int[] marks; // one dimensional array
        int[][] flats; // two dimensional arrays
        flats = new int[3][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        flats[2][0] = 301;
        flats[2][1] = 302;
        flats[2][2] = 303;
        System.out.println(flats.length);
        // System.out.println("Printing 2d array Using loops");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.println(flats[i][j]);
            }

        }
//  = = = = = =  = = = = = = =  = = = = = = = = = = = = = = = = = = ==  = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // note:----------> if we print like below we will get the address of the arrays stored at each index of the first
        // list(very very important)
        for(int k=0;k<flats.length;k++){
            System.out.println(flats[k]);
            System.out.println(flats[k].length);
        }
//  =  = = = =  = = = = = = =  = = = = = = = = = = = = = = = = = = ==  = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =


    }
}